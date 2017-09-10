package com.rafazampieri.algorithms.ch01;

import java.util.Arrays;

import org.junit.Test;

import com.rafazampieri.algorithms.TestUtils;

public class SelectionSortTest {
	
	private SelectionSort selectionSort = new SelectionSort(); 
	
	@Test
	public void testAlgorithm(){
		Integer[] actual = TestUtils.getIntArray(100);
		selectionSort.sort(actual);
		
		Integer[] expected = actual.clone();
		Arrays.sort(expected);
		
		TestUtils.hasSameContent(actual, expected);
	}

}
