package com.rafazampieri.crackingthecodeinterview.ch01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Ex07SetZerosInMatrixTest {
	
	private Ex07SetZerosInMatrix solution;
	
	@Before
	public void setup(){
		solution = new Ex07SetZerosInMatrix();
	}
	
	@Test
	public void testSetZerosCase1(){
		int[][] matrix = new int[][]{
			{ 1, 1, 1 },
			{ 1, 1, 1 },
			{ 1, 1, 0 }
		};
		
		int[][] expected = new int[][]{
			{ 1, 1, 0 },
			{ 1, 1, 0 },
			{ 0, 0, 0 }
		};
		
		solution.setZeros(matrix);
		
		assertMatrix(matrix, expected);
	}
	
	@Test
	public void testSetZerosCase2(){
		int[][] matrix = new int[][]{
			{ 1, 1, 1 },
			{ 1, 0, 0 },
			{ 1, 1, 1 }
		};
		
		int[][] expected = new int[][]{
			{ 1, 0, 0 },
			{ 0, 0, 0 },
			{ 1, 0, 0 }
		};
		
		solution.setZeros(matrix);
		
		assertMatrix(matrix, expected);
	}
	
	private void assertMatrix(int[][] matrix, int[][] expected){
		Assert.assertTrue(matrix[0][0] == matrix[0][0]);
		Assert.assertTrue(matrix[0][1] == matrix[0][1]);
		Assert.assertTrue(matrix[0][2] == matrix[0][2]);
		Assert.assertTrue(matrix[1][0] == matrix[1][0]);
		Assert.assertTrue(matrix[1][1] == matrix[1][1]);
		Assert.assertTrue(matrix[1][2] == matrix[1][2]);
		Assert.assertTrue(matrix[2][0] == matrix[2][0]);
		Assert.assertTrue(matrix[2][1] == matrix[2][1]);
		Assert.assertTrue(matrix[2][2] == matrix[2][2]);
	}

}
