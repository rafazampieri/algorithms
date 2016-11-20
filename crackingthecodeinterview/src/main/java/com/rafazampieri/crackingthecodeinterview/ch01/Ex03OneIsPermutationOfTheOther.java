package com.rafazampieri.crackingthecodeinterview.ch01;

import java.util.Arrays;

public class Ex03OneIsPermutationOfTheOther {
	
	// page 73
	// Given two strings, write a method to decide if one is a permutation of the other
	
	public boolean isPermutationUsingIntArray(String one, String other){
		if(one.length() != other.length()){
			return false;
		}
		
		int[] charControl = new int[256];
		
		char[] charArrayFromOne = one.toCharArray();
		for (char characterFromOne: charArrayFromOne) {
			charControl[characterFromOne]++;
		}
		
		char[] charArrayFromOther = other.toCharArray();
		for (char characterFromOther: charArrayFromOther) {
			if(--charControl[characterFromOther] < 0){
				return false;
			}
		}
		
		return true;
	}
	
	public boolean isPermutationUsingSort(String one, String other){
		if(one.length() != other.length()){
			return false;
		}
		
		return sort(one).equals(sort(other));
	}
	
	private String sort(String text){
		char[] charArray = text.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}
	
	public boolean isPermutationWhenSpaceIsIgnored(String one, String other){
		one = one.replaceAll(" ", "");
		other = other.replaceAll(" ", "");
		if(one.length() != other.length()){
			return false;
		}
		
		char[] charArrayFromOne = one.toCharArray();
		char[] charArrayFromOther = other.toCharArray();
		int characterControl = 0;
		for (int j = 0; j < charArrayFromOne.length; j++) {
			char characterFromOne = charArrayFromOne[j];
			for (int i = 0; i < charArrayFromOther.length; i++) {
				if( characterFromOne == charArrayFromOther[i] ){
					charArrayFromOther[i] = ' ';
					characterControl++;
					break;
				}
			}
			
			if(characterControl <= j){
				return false;
			}
		}
		
		return true;
	}


}
