package com.rafazampieri.algorithms.ch01;

import java.util.Arrays;

import org.junit.Test;

import com.rafazampieri.algorithms.TestUtils;

public class MergeSortTest {
	
	private MergeSort mergeSort = new MergeSort();
	
	@Test
	public void testSort(){
		Integer[] actual = getIntArray();
		mergeSort.sort(actual);
		
		Integer[] expected = getIntArray();
		Arrays.sort(expected);
		
		TestUtils.hasSameContent(actual, expected);
	}

	private Integer[] getIntArray() {
		return new Integer[]{5, 4, 3, 2, 1};
	}

}
