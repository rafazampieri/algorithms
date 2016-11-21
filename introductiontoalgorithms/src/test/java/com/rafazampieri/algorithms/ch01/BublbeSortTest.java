package com.rafazampieri.algorithms.ch01;

import java.util.Arrays;

import org.junit.Test;

public class BublbeSortTest {
	
	private BubbleSort bubbleSort = new BubbleSort();
	
	@Test
	public void testSort(){
		Integer[] actual = getIntArray();
		bubbleSort.sort(actual);
		
		Integer[] expected = getIntArray();
		Arrays.sort(expected);
		
		TestUtils.hasSameContent(actual, expected);
	}

	private Integer[] getIntArray() {
		return new Integer[]{5, 4, 3, 2, 1};
	}

}
