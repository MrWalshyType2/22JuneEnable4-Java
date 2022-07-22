package com.qa.generics.generic_example;

// GenericBox is a parameterised type
// - this is because we have specified a type parameter
//   inside a diamond operator
// - the <T> after the name of the class is the generic
//   type bound
// - <T> states that given a type, this GenericBox is guaranteed
//   to work with and return objects of that type
public class GenericBox<T> {

	// Type safety is important
	// - Using a parameterised type is type safe
	private T value;

	public GenericBox(T value) {
		this.value = value;
	}

	
	public T get() {
		return value;
	}

	@Override
	public String toString() {
		return "Box [value=" + value + "]";
	}
}
