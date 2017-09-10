package com.rafazampieri.crackingthecodeinterview.ch01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Ex08IsRotationTest {
	
	private Ex08IsRotation solution;
	
	@Before
	public void setup(){
		solution = new Ex08IsRotation();
	}
	
	@Test
	public void testIsRotation(){
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		Assert.assertTrue(solution.isRotation(s1, s2));
	}
	
	@Test
	public void testIsNotRotation(){
		String s1 = "waterbo ttle";
		String s2 = "erbottl ewat";
		
		Assert.assertFalse(solution.isRotation(s1, s2));
	}

}
