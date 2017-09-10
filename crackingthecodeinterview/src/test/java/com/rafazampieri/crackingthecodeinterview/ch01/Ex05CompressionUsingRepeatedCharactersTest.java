package com.rafazampieri.crackingthecodeinterview.ch01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Ex05CompressionUsingRepeatedCharactersTest {
	
	private Ex05CompressionUsingRepeatedCharacters solution;
	
	@Before
	public void setup(){
		this.solution = new Ex05CompressionUsingRepeatedCharacters();
	}
	
	@Test
	public void testValidString(){
		String text = "aabcccccaaa";
		String expectedString = "a2b1c5a3";
		
		Assert.assertTrue(solution.countRepeatedCharactersWithStringBuffer(text).equals(expectedString));
		Assert.assertTrue(solution.countRepeatedCharactersWithoutStringBuffer(text).equals(expectedString));
	}
	
	@Test
	public void testWithInvalidSizeOfResult(){
		String text = "aabccdeeaa";
		
		Assert.assertTrue(solution.countRepeatedCharactersWithStringBuffer(text).equals(text));
		Assert.assertTrue(solution.countRepeatedCharactersWithoutStringBuffer(text).equals(text));
	}
	
}
