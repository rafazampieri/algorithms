package com.rafazampieri.crackingthecodeinterview.ch01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Ex06RotateImageTest {
	
	private Ex06RotateImage solution;
	
	@Before
	public void setup(){
		solution = new Ex06RotateImage();
	}
	
	@Test
	public void testRotateImage(){
		int[][] imagePixels = new int[][]{
			{ 1, 2, 3 },
			{ 4, 5, 6 },
			{ 7, 8, 9 }
		};
		int[][] expectedResult = new int[][]{
			{ 7, 4, 1 },
			{ 8, 5, 2 },
			{ 9, 6, 3 }
		};
		solution.rotateImage(imagePixels);
		
		Assert.assertTrue(imagePixels[0][0] == expectedResult[0][0]);
		Assert.assertTrue(imagePixels[0][1] == expectedResult[0][1]);
		Assert.assertTrue(imagePixels[0][2] == expectedResult[0][2]);
		Assert.assertTrue(imagePixels[1][0] == expectedResult[1][0]);
		Assert.assertTrue(imagePixels[1][1] == expectedResult[1][1]);
		Assert.assertTrue(imagePixels[1][2] == expectedResult[1][2]);
		Assert.assertTrue(imagePixels[2][0] == expectedResult[2][0]);
		Assert.assertTrue(imagePixels[2][1] == expectedResult[2][1]);
		Assert.assertTrue(imagePixels[2][2] == expectedResult[2][2]);
	}

}
