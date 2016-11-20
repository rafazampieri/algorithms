package com.rafazampieri.crackingthecodeinterview.ch01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.rafazampieri.crackingthecodeinterview.TestUtils;

public class Ex03OneIsPermutationOfTheOtherTest {
	
	private Ex03OneIsPermutationOfTheOther solution;
	
	@Before
	public void setup(){
		solution = new Ex03OneIsPermutationOfTheOther();
	}
	
	@Test
	public void testIsPermutationWhenSpaceIsIgnored(){
		Assert.assertTrue(solution.isPermutationWhenSpaceIsIgnored("abc", "cba"));
		Assert.assertTrue(solution.isPermutationWhenSpaceIsIgnored(TestUtils.generateTextWith256Characters(), TestUtils.generateTextWith256Characters()));
		Assert.assertFalse(solution.isPermutationWhenSpaceIsIgnored("abc", "cbz"));
		Assert.assertFalse(solution.isPermutationWhenSpaceIsIgnored("aabc", "cba"));
	}
	
	@Test
	public void testIsPermutationUsingIntArray(){
		Assert.assertTrue(solution.isPermutationUsingIntArray("abc", "cba"));
		Assert.assertTrue(solution.isPermutationUsingIntArray(TestUtils.generateTextWith256Characters(), TestUtils.generateTextWith256Characters()));
		Assert.assertFalse(solution.isPermutationUsingIntArray("abc", "cbz"));
		Assert.assertFalse(solution.isPermutationUsingIntArray("aabc", "cba"));
		
	}
	
	@Test
	public void testIsPermutationUsingSort(){
		Assert.assertTrue(solution.isPermutationUsingSort("abc", "cba"));
		Assert.assertTrue(solution.isPermutationUsingSort(TestUtils.generateTextWith256Characters(), TestUtils.generateTextWith256Characters()));
		Assert.assertFalse(solution.isPermutationUsingSort("abc", "cbz"));
		Assert.assertFalse(solution.isPermutationUsingSort("aabc", "cba"));
		
	}

}
