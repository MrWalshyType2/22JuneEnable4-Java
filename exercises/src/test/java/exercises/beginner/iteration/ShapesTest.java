package exercises.beginner.iteration;

import static org.junit.Assert.assertTrue;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercises.utility.StandardOutputReader;

class ShapesTest {

	private StandardOutputReader stdoutReader;
	private Shapes shapes;

	@BeforeEach
	void setUp() throws Exception {
		stdoutReader = new StandardOutputReader();
		stdoutReader.redirectStandardOut();
		shapes = new Shapes();
	}
	
	@AfterEach
	void teardown() {
		stdoutReader.restoreStandardOutput();
	}

	@Test
	void testPrintRightAngledTriangle() throws UnsupportedEncodingException {
		String expected = "#\r\n"
				+ "##\r\n"
				+ "###\r\n"
				+ "####\r\n"
				+ "#####";
		shapes.printRightAngledTriangle();
		assertTrue("Expected output to contain:\n\n%s\n\nActually printed:\n\n%s\n\n".formatted(expected, stdoutReader.read()),
				stdoutReader.contains(expected));
	}

	@Test
	void testPrintInvertedRightAngledTriangle() throws UnsupportedEncodingException {
		String expected = "#####\r\n"
				+ "####\r\n"
				+ "###\r\n"
				+ "##\r\n"
				+ "#";
		shapes.printInvertedRightAngledTriangle();
		assertTrue("Expected output to contain:\n\n%s\n\nActually printed:\n\n%s\n\n".formatted(expected, stdoutReader.read()),
				stdoutReader.contains(expected));
	}

	@Test
	void testPrintLeftAngledTriangle() throws UnsupportedEncodingException {
		String expected = "#\r\n"
				+ "   ##\r\n"
				+ "  ###\r\n"
				+ " ####\r\n"
				+ "#####";
		shapes.printLeftAngledTriangle();
		assertTrue("Expected:\n\n%s\n\nActually printed:\n\n%s\n\n".formatted(expected, stdoutReader.read()),
				stdoutReader.contains(expected));
	}

	@Test
	void testPrintInvertedLeftAngledTriangle() throws UnsupportedEncodingException {
		String expected = "#####\r\n"
				+ " ####\r\n"
				+ "  ###\r\n"
				+ "   ##\r\n"
				+ "    #";
		shapes.printInvertedLeftAngledTriangle();
		assertTrue("Expected output to contain:\n\n%s\n\nActually printed:\n\n%s\n\n".formatted(expected, stdoutReader.read()),
				stdoutReader.contains(expected));
	}

	@Test
	void testPrintAcuteTriangle() throws UnsupportedEncodingException {
		String expected = "   #\r\n"
				+ "  ###\r\n"
				+ " #####\r\n"
				+ "#######";
		shapes.printAcuteTriangle();
		assertTrue("Expected output to contain:\n\n%s\n\nActually printed:\n\n%s\n\n".formatted(expected, stdoutReader.read()),
				stdoutReader.contains(expected));
	}

	@Test
	void testPrintZigZag() throws UnsupportedEncodingException {
		String expected = "#\r\n"
				+ " #\r\n"
				+ "# \r\n"
				+ " #\r\n"
				+ "#\r\n"
				+ " #";
		shapes.printZigZag();
		assertTrue("Expected output to contain:\n\n%s\n\nActually printed:\n\n%s\n\n".formatted(expected, stdoutReader.read()),
				stdoutReader.contains(expected));
	}

	@Test
	void testPrintCircle() throws UnsupportedEncodingException {
		String expected = " ##\r\n"
				+ "#  #\r\n"
				+ "#  #\r\n"
				+ " ##";
		shapes.printCircle();
		assertTrue("Expected output to contain:\n\n%s\n\nActually printed:\n\n%s\n\n".formatted(expected, stdoutReader.read()),
				stdoutReader.contains(expected));
	}

}
