package com.springexample.SimpleSpringExample;

public class BinarySearchImpl {
	
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int sortedNumbers[] = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}
}
