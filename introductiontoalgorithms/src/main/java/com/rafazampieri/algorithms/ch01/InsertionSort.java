package com.rafazampieri.algorithms.ch01;

public class InsertionSort {
	
	public void sortAscending(Integer[] numbers){
		for (int i = 1, j = 0; i < numbers.length; i++, j = i-1) {
			int number = numbers[i];
			while(j >= 0 && number < numbers[j]){
				numbers[j + 1] = numbers[j];
				j--;
			}
			numbers[j + 1] = number;
		}
	}
	
	public void sortDescending(Integer[] numbers){
		for (int i = numbers.length - 2, j = i + 1; i >= 0; i--, j = i + 1) {
			int number = numbers[i];
			while(j < numbers.length && number < numbers[j]){
				numbers[j - 1] = numbers[j];  
				j++;
			}
			numbers[j-1] = number;
		}
	}
	
	
	
	
	
}
