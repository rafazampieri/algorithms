package com.rafazampieri.algorithms.ch01;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

import com.rafazampieri.algorithms.ch01.InsertionSort;

public class InsertionSortTest {
	
	private InsertionSort insertionSort = new InsertionSort();
	
	@Test
	public void testAlgorithmAscending(){
		Integer[] actual = TestUtils.getIntArray(100);
		insertionSort.sortAscending(actual);
		
		Integer[] expected = actual.clone();
		Arrays.sort(expected);
		
		TestUtils.hasSameContent(actual, expected);
	}
	
	@Test
	public void testAlgorithmDescending(){
		Integer[] actual = getIntArray();
		insertionSort.sortDescending(actual);
		
		Integer[] expected = getIntArray();
		Arrays.sort(expected, Collections.reverseOrder());
		
		TestUtils.hasSameContent(actual, expected);
	}
	
	private Integer[] getIntArray(){
		return new Integer[]{5, 2, 4, 6, 1, 3};
	}

}
