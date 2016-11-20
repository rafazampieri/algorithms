package com.rafazampieri.crackingthecodeinterview.ch01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.rafazampieri.crackingthecodeinterview.TestUtils;
import com.rafazampieri.crackingthecodeinterview.ch01.Ex01HasOnlyUniqueCharacters;

public class Ex01HasOnlyUniqueCharactersTest {
	
	private final String INVALID_TEXT = "abcdAa";
	private final String TEXT_WITH_UNIQUE_256_CHARACTERS = TestUtils.generateTextWith256Characters();
	private final String TEXT_WITH_ALL_LETTERS = TestUtils.generateTextWithAllLetters();
	
	private Ex01HasOnlyUniqueCharacters solution;
	
	@Before
	public void setup(){
		solution = new Ex01HasOnlyUniqueCharacters();
	}
	
	@Test
	public void testHasOnlyUniqueCharactersSolutionWithDataStructure(){
		Assert.assertTrue(solution.hasOnlyUniqueCharactersSolutionWithDataStructure(TEXT_WITH_UNIQUE_256_CHARACTERS));
		Assert.assertFalse(solution.hasOnlyUniqueCharactersSolutionWithDataStructure(INVALID_TEXT));
	}
	
	@Test
	public void testHasOnlyUniqueCharacters(){
		Assert.assertTrue(solution.hasOnlyUniqueCharacters(TEXT_WITH_UNIQUE_256_CHARACTERS));
		Assert.assertFalse(solution.hasOnlyUniqueCharacters(INVALID_TEXT));
	}
	
	@Test
	public void testHasOnlyUniqueLettersIgnoreCase(){
		Assert.assertTrue(solution.hasOnlyUniqueLettersIgnoreCase(TEXT_WITH_ALL_LETTERS));
		Assert.assertFalse(solution.hasOnlyUniqueLettersIgnoreCase(INVALID_TEXT));
	}
	
}
