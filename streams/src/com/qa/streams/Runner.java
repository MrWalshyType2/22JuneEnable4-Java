package com.qa.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		List<String> names = List.of("Bert", "Aiden", "Sarah");
		
		// To turn a collection into a stream, call its .stream() method
		names.stream()
		     .forEach(name -> System.out.println(name));
		// .forEach() when called on a non-infinite stream will terminate the stream
		// once it has called the given consumer on each element in the stream
		
		// Common terminal operations:
		// - count(): returns the count of elements in the stream
		// - min() and max(): returns the minimum or maximum value in the stream
		// - findAny() and findFirst()
		// - forEach()
		// - reduce(): used to reduce a stream of multiple elements to a single value
		// - collect(): used to collect the result of applying intermediary operations to a stream
		long namesLength = names.stream()
								.count();
		
		Optional<String> minimumName = names.stream()
				 							.min((str1, str2) -> str1.compareTo(str2));
		// An Optional represents either a value being present or there being no value at all
		// - it is a type safe wrapper for the null value
		minimumName.ifPresent((name) -> System.out.println(name));
		
		// If you want to get a value out of an optional
		// - get() will throw an exception if there is no value
		// - orElseThrow() allows you to specify an exception to throw if no value exists
		// - orElse() allows you to specify a default value to return
		String name = minimumName.orElse("Name wasn't found");
		minimumName.orElseThrow(() -> new RuntimeException("Name not found")); // doesn't throw the exception as minimumName does
		// contain a value
		
		// Common non-terminal/intermediary operations:
		// - map: transforming the values in the stream, potentially from one data type to another
		// - filter: removing items from a stream if they don't match a given predicate
		List<Integer> nameLengths = names.stream()
										 .map(n -> n.length())
										 .collect(Collectors.toList());
		nameLengths.forEach(length -> System.out.println("Length: " + length)); 
		// streams retain their original order unless they are sorted differently during a stream operation
		
		// map() accepts a Function<T,R>
		// - T is the input type, R the output type
		
		// filter() accepts a Predicate<T>
		List<Integer> numbers = List.of(1,2,3,4,5,6);
		numbers.stream()
			   .filter(num -> num % 2 == 0) // allow only even numbers, remove odd numbers
			   .forEach(System.out::println); // we could use a method reference, the data will automatically be passed to 
											  // the method as it matches the Consumer<T> interfaces SAM
	}

}
