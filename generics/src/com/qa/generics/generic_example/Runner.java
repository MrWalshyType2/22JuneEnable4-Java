package com.qa.generics.generic_example;

public class Runner {

	public static void main(String[] args) {
		// With generics, Java will enforce the data type
		// during compilation of the program (compile-time)
		// rather than when running the compile program (run-time)
		GenericBox<Integer> myNumberBox = new GenericBox<>(19);
		Integer number = myNumberBox.get();
		// The GenericBox enforces type safety
		
		// In the following box, we have stated that it can
		// only store a String. Trying to pass it a value
		// of a different type causes a compile-time error.
		// - we now have type-safety, we can't force objects
		//   of different types into the wrong variable
//		GenericBox<String> myStringBox = new GenericBox<String>(50);
	}

}
