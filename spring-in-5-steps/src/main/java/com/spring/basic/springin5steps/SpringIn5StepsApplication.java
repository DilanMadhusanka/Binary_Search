package com.spring.basic.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		//int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		//System.out.println(result);
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int[] result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		System.out.println(" ");
	}

}
