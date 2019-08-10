package com.springexample.SimpleSpringExample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimpleSpringExampleApplicationTests {

	@Test
	void contextLoads() {
	}
	
	public static void main(String[] args) {
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearchImpl.binarySearch(new int[] {12,4,6}, 3);
		System.out.println(result);
		
		//SpringApplication.run(SimpleSpringExampleApplicationTests.class, args);
	}

}
