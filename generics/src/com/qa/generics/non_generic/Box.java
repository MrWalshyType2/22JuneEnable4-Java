package com.qa.generics.non_generic;

public class Box {

	// Type safety is important
	// - Using Object is not type safe
	private Object value;
	
	public Box(Object value) {
		this.value = value;
	}
	
	// We don't know what type is actually in the value
	// field, so we have to return it as the 
	// supertype, Object
	public Object get() {
		return value;
	}

	@Override
	public String toString() {
		return "Box [value=" + value + "]";
	}

	
}
