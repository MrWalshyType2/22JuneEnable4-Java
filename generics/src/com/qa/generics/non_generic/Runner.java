package com.qa.generics.non_generic;

public class Runner {

	public static void main(String[] args) {
		Box b = new Box(9.9);
		System.out.println(b);
		
		Box b2 = new Box(new Box(5));
		System.out.println(b2);
		
		// We can't do this, we have lost type safety
//		Box innerBox = b2.get();
		
		// The only way to get the inside value as its original
		// type is to typecast it
		Box innerBox = (Box) b2.get();
		System.out.println(innerBox);
		
		// the following throws a ClassCastException
//		Box innerBox2 = (Box) b.get(); // b has a Double inside it
//		System.out.println(innerBox);
		// We cannot put a Double into a variable of type Box
		// - we have lost type safety
		
		// To get the value without throwing a ClassCastException
		// we would have to do instanceof check
		Object o = b.get();
		Double d = null;
		if (o instanceof Double) {
			// instanceof runs two checks:
			// - that o is not null
			// - that o is of type Double
			d = (Double) o;
		}
		System.out.println(d);
		
		// We can only find out the type of the object
		// inside the box at runtime, i.e., while the program
		// is running.
		// - We don't know what bugs exist with this Box
		//   until we actually run the program
	}

}
