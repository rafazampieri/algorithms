package com.rafazampieri.crackingthecodeinterview.ch01;

public class Ex07SetZerosInMatrix {
	
	// page 73
	// Write an algorithm such that if an element in an MxN matrix is 0, its
	// entire row and column are set to 0.

	public void setZeros(int[][] matrix) {
		boolean[] rowsToSetZeros = new boolean[matrix.length];
		boolean[] columnsToSetZeros = new boolean[matrix[0].length];

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] == 0) {
					rowsToSetZeros[row] = true;
					columnsToSetZeros[column] = true;
				}
			}
		}

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (rowsToSetZeros[row] || columnsToSetZeros[column]) {
					matrix[row][column] = 0;
				}
			}
		}
	}

}
