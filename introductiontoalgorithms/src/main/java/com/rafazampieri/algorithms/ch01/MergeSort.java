package com.rafazampieri.algorithms.ch01;

public class MergeSort {
	
	public void sort(Integer[] numbers){
		if(numbers.length == 1){
			return;
		} else if(numbers.length == 2){
			int number = numbers[0];
			if(number > numbers[1]){
				numbers[0] = numbers[1];
				numbers[1] = number;
			}
			return;
		}
		
		Integer[] numbersA = new Integer[numbers.length/2];
		for (int i = 0; i < numbersA.length; i++) {
			numbersA[i] = numbers[i];
		}
		sort(numbersA);
		
		Integer[] numbersB = new Integer[ (numbers.length/2) + (numbers.length % 2 != 0 ? 1: 0 ) ];
		for (int i = 0; i < numbersB.length; i++) {
			numbersB[i] = numbers[(numbers.length/2) + i];
		}
		sort(numbersB);
		
		int indexA = 0, indexB = 0;
		for (int i = 0; i < numbers.length; i++) {
			if(indexA == numbersA.length){
				for (; indexB < numbersB.length; indexB++) {
					numbers[i++] = numbersB[indexB];
				}
			} else if(indexB == numbersB.length){
				for (; indexA < numbersA.length; indexA++) {
					numbers[i++] = numbersA[indexA];
				}
			} else if(numbersA[indexA] > numbersB[indexB]){
				numbers[i] = numbersB[indexB++];
			} else if(numbersA[indexA] < numbersB[indexB]){
				numbers[i] = numbersA[indexA++];
			} else {
				numbers[i++] = numbersA[indexA++];
				numbers[i] = numbersB[indexB++];
			}
		}
	}

}
