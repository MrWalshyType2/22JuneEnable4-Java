package exercises.beginner.arrays;

public class ArrayIteration {

	public static void main(String[] args) {
		var ar = new ArrayIteration();
//		System.out.println(ar.sumOf(new int[] { 1, 1, 1 }));

		int[] sorted = ar.poorBubbleSort(new int[] { 3, 2, 1, 7798324, 3243243, 5453545, 32, 18, 31, 22, 22 });

//		for (var num : sorted) {
//			System.out.println(num);
//		}
		
		System.out.println(ar.binarySearch(sorted, 2));
	}

	// Given an array of integers, return the sum of its values as a long
	public long sumOf(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// Given an array of integers and an integer number, return the index of the
	// first encountered
	// matching number in the array, otherwise return -1.
	//
	// Complexity: O(n)
	// - This is known as a linear search algorithm, where you must check every element of the array,
	// as the array is not known to be in a sorted order.
	// - n is the number of items in the list, signifying that more steps are carried out as the size
	//   of the array increases
	//
	// For example:
	//
	// indexOf(new int[] { 1, 2, 3 }, 2); // 1
	// indexOf(new int[] { 1, 2, 3 }, 8); // -1
	public int indexOf(int[] arr, int number) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number)
				return i;
		}
		return -1;
	}

	// Create a method, that given an array, creates a shallow copy of the original.
	// - a shallow copy is made by copying the references of each item in the
	// original array into the copy
	public int[] copy(int[] arr) {
		int[] copy = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		return copy;
	}

	// Create a method, that given an array, returns the maximum number in the
	// array. Assume the array
	// is not in a sorted order. If the array is empty, return 0.
	public int max(int[] arr) {
		if (arr.length == 0)
			return 0;
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	// Create a method, that given an array, returns the minimum number in the
	// array. Assume the array
	// is not in a sorted order. If the array is empty, return 0.
	public int min(int[] arr) {
		if (arr.length == 0)
			return 0;
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > min)
				min = arr[i];
		}
		return min;
	}

	// Implement a method that when given an array of integers, it uses bubble sort
	// to sort the array. This is a simple
	// algorithm for sorting arrays which works as follows:
	//
	// 1. for each _element_ in the _array_:
	// 2. if the current _element_ is greater than the next element in the _array_:
	// 3. swap the positions of the elements
	// 2. repeat until no an iteration occurs where no swap happens
	//
	// bubbleSort(new int[] { 3, 2, 1 });
	// - Loop 1, iteration 1, index 0: { 2, 3, 1 } <-- swap occurs between 3 and 2
	// - Loop 1, iteration 2, index 1: { 2, 1, 3 } <-- swap occurs between 3 and 1
	// - Loop 1, iteration 3, index 2: { 2, 1, 3 } <-- no swap
	//
	// - Loop 2, iteration 1, index 0: { 1, 2, 3 } <-- swap occurs between 2 and 1
	// - Loop 2, iteration 2, index 1: { 1, 2, 3 } <-- no swap
	// - Loop 2, iteration 3, index 2: { 1, 2, 3 } <-- no swap
	//
	// - Loop 3, iteration 1, index 0: { 1, 2, 3 } <-- no swap
	// - Loop 3, iteration 2, index 1: { 1, 2, 3 } <-- no swap
	// - Loop 3, iteration 3, index 2: { 1, 2, 3 } <-- no swap
	//
	/// The sorted array should be returned.
	//
	// Runtime complexity: O(n^2)
	// - In the worst case, the array may be in completely reverse order, meaning
	//   it needs to be iterated over n times, with each iteration iterating over
	//   every element in the list.
	public int[] bubbleSortTwoFlags(int[] arr) {
		boolean isUnsorted = true;
		boolean didSwap = false;

		while (isUnsorted) {
			// arr.length - 1 as the last element has nothing after it to compare it to
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					didSwap = true;
				}
			}
			if (didSwap == false)
				isUnsorted = false; // array is sorted, yay
			else
				didSwap = false; // reset for next loop through the array
		}
		return arr;
	}

	public int[] bubbleSortOneFlag(int[] arr) {
		boolean didSwap;
		
		do {
			didSwap = false;
			// arr.length - 1 as the last element has nothing after it to compare it to
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					didSwap = true;
				}
			}
		} while (didSwap); // do-while as array could already be sorted but not yet verified
		return arr;
	}

	public int[] poorBubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		return arr;
	}
	
	// Given a sorted array of integers, implement a binary search where the index of the element
	// is returned or -1 if the element does not exist.
	// - array has to be sorted for binary search to work
	//
	// 1. Set _middle_ to the middle index of _array_
	// 2. while _array_ is not empty:
	//     1. if array[middle] is the desired number:
	//         1. return middle
	//     2. otherwise if array[middle] is greater than the desired number: set upperbound to middle - 1
	//     3. otherwise array[middle] is less than the desired number: set lowerbound to middle + 1
	// 3. return -1
	public int binarySearch(int[] arr, int number) {
		int index = -1; // default value, item does not exist
		int lowerBound = 0; // lower bound of the array to be searched
		int upperBound = arr.length; // upper bound of the array to be searched
		// the boundaries are used to find the middle index and narrow the section of the array being searched
		
		while (lowerBound <= upperBound) {
			int middle = (lowerBound + upperBound) / 2;
			
			if (arr[middle] == number) return middle;
			else if (arr[middle] > number) upperBound = middle - 1;
			else lowerBound = middle + 1;
		}
		return index;
	}
}
