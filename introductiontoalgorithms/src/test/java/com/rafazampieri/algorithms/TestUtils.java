package com.rafazampieri.algorithms.ch01;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class TestUtils {
	
	public static void hasSameContent(Integer[] actual, Integer[] expected){
		assertTrue(actual.length == expected.length);
		for (int i = 0; i < expected.length; i++) {
			assertThat(actual[i], is(equalTo(expected[i])));
		}
	}
	
	
	public static Integer[] getIntArray(int size){
		Integer[] numbers = new Integer[size];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * Integer.MAX_VALUE);
		}
		return numbers;
	}

}
