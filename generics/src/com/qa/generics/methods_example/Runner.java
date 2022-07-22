package com.qa.generics.methods_example;

import java.util.List;

public class Runner {

	public static void main(String[] args) {
		Runner r = new Runner();
		List<String> stringList = List.of("Fred", "Bob");
		List<Integer> numberList = List.of(1,2,3,4,5,6);
		
		System.out.println(r.count(stringList));
		System.out.println(r.count(numberList));
		System.out.println(r.countAlternate(stringList));
		System.out.println(r.countAlternate(numberList));
	}

	// We can create generic methods which do not
	// require a type parameter on the class
	// - the type parameter is instead specified in the method
	public <T> int count(List<T> items) {
		return items.size();
	}
	// if we care about the type, we will specify the generic
	// type bound
	
	// if we don't care about the generic type which List uses,
	// we can use a wildcard
	// - the ? indicates we don't care about the type
	// - it could still have an upper bound though, such as
	//   ? extends Item. It is more we don't care about the 
	//   type because we don't use the values in the list
	public int countAlternate(List<?> items) {
		return items.size();
	}
}
