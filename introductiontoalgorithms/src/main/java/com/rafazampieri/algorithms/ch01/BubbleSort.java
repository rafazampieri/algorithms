package com.rafazampieri.algorithms.ch01;

public class BubbleSort {
	
	public void sort(Integer[] numbers){
		int sizeToSort = numbers.length;
		while(sizeToSort > 0){
			for (int i = 1; i < sizeToSort; i++) {
				if(numbers[i-1] > numbers[i]){
					int number = numbers[i-1];
					numbers[i-1] = numbers[i];
					numbers[i] = number;
				}
			}
			sizeToSort--;
		}
	}

}
