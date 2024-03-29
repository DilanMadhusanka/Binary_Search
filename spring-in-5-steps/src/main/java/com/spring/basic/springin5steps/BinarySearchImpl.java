package com.spring.basic.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	
	/*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}*/

	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public int[] binarySearch(int[] numbers, int numberToSearchFor) {
		//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		//System.out.println(sortAlgorithm);
		
		for(int i=0; i < sortedNumbers.length; i++){  
            System.out.print(sortedNumbers[i] + " \n");  
		}
		
		//binary search
		
		int first = 0,last = sortedNumbers.length-1;
		int mid = (first + last)/2;  
		while( first <= last ){  
			if ( sortedNumbers[mid] < numberToSearchFor ){  
				first = mid + 1;     
		    }else if ( sortedNumbers[mid] == numberToSearchFor ){  
		    	System.out.println("Element is found at index: " + mid);  
		        break;  
		    }else{  
		        last = mid - 1;  
		    }  
		    mid = (first + last)/2;  
		 }  
		    
		if( first > last ){  
		      System.out.println("Element is not found!");  
		}
		
		//end binary search
		
		return sortedNumbers;
	}
}
