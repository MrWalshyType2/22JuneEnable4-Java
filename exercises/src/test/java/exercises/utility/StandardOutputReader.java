package exercises.utility;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class StandardOutputReader {

	private ByteArrayOutputStream out;
	private PrintStream stdout;
	
	public StandardOutputReader() {
		out = new ByteArrayOutputStream();
		stdout = System.out;
	}
	
	/**
	 * Redirects <code>System.out</code> to an internal stream.
	 */
	public void redirectStandardOut() {
		System.setOut(new PrintStream(out));
	}
	
	/**
	 * Returns a UTF-8 string representing the current content of the <code>System.out</code> output stream,
	 * with leading and trailing whitespace trimmed.
	 * @throws UnsupportedEncodingException 
	 */
	public String read() throws UnsupportedEncodingException {
		return out.toString("UTF-8").trim();
	}
	
	public boolean contains(String string) throws UnsupportedEncodingException {
		if (this.read().contains(string)) return true; // outputted using println(), /r/n
		// try trim /r, checking for manual input on some newlines
		String trimmedInput = string.replace("\r", "");
		String trimmedReaderInput = this.read().replace("\r", "");
		if (trimmedReaderInput.contains(trimmedInput)) return true;
		return false;
	}
	
	/**
	 * This restores <code>System.out</code> to its prior <code>PrintStream</code>. This does not
	 * remove content from the existing internal stream that was prior connected to standard output.
	 * If you require a clean stream, create a new reader.
	 */
	public void restoreStandardOutput() {
		System.setOut(stdout);
	}

}
