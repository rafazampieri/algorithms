package com.rafazampieri.algorithms.ch01;

public class SelectionSort {
	
	public void sort(Integer[] numbers){
		for (int i = 0; i < numbers.length; i++) {
			Integer number = numbers[i];
			int position = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if(numbers[j] < number){
					position = j;
					number = numbers[j];
				}
			}
			if(position != i){
				numbers[position] = numbers[i];
				numbers[i] = number;
			}
		}
	}
	
}
