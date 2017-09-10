package com.rafazampieri.crackingthecodeinterview.ch01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Ex04ReplaceSpaceInStringTest {
	
	private Ex04ReplaceSpaceInString solution;
	
	@Before
	public void setup(){
		solution = new Ex04ReplaceSpaceInString();
	}
	
	@Test
	public void testValidString(){
		String text = "a b c    ";
		String resultText = solution.replaceSpaceInString(text);
		Assert.assertTrue(resultText.equals("a%20b%20c"));
	}
	
	@Test(expected=StringIndexOutOfBoundsException.class)
	public void testInvalidStringBeacauseHasOddSpacesInTheEndOfTheText(){
		String text = "a b c     ";
		solution.replaceSpaceInString(text);
	}
	
	@Test(expected=StringIndexOutOfBoundsException.class)
	public void testInvalidStringBeacauseHasMoreSpacesInTheMiddleOfTheTextThanExpected(){
		String text = "a  b c    ";
		solution.replaceSpaceInString(text);
	}
	
	@Test(expected=StringIndexOutOfBoundsException.class)
	public void testInvalidStringBeacauseHasMoreSpacesInTheBeginOfTheTextThanExpected(){
		String text = " a b c    ";
		solution.replaceSpaceInString(text);
	}

}
