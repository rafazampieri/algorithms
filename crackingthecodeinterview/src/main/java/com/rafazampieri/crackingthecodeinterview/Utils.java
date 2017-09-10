package com.rafazampieri.crackingthecodeinterview;

public class Utils {
	
	public static void printMatrix(int[][] matrix){
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix.length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}
	
	public static void printAllNodes(Node node){
		Integer index = 0;
		while(node != null){
			System.out.println((index++) + ": " + node.data);
			node = node.next;
		}
	}

}
