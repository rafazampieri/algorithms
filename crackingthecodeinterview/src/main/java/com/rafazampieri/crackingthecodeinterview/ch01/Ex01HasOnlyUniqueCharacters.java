package com.rafazampieri.crackingthecodeinterview.ch01;

import java.util.HashSet;

public class Ex01HasOnlyUniqueCharacters {

	// page 73
	// Implement an algorithm to determine if a string has all unique
	// characters. What if you cannot use additional data structures?

	public boolean hasOnlyUniqueCharacters(String text) {
		if (text == null || text.length() > 256) {
			return false;
		}

		boolean[] usedChars = new boolean[256];
		for (int i = 0; i < text.length(); i++) {
			char charAt = text.charAt(i);
			if (usedChars[charAt]) {
				return false;
			}
			usedChars[charAt] = true;
		}

		return true;
	}
	
	public boolean hasOnlyUniqueLettersIgnoreCase(String text) {
		if(text == null || text.matches("^[a-zA-Z]+$") == false){
			return false;
		}
		
		text = text.toLowerCase();
		int checker = 0;
		for (int i = 0; i < text.length(); i++) {
			int val = text.charAt(i);
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}
	
	public boolean hasOnlyUniqueCharactersSolutionWithDataStructure(String text) {
		if(text == null){
			return false;
		}
		
		HashSet<Character> hashSet = new HashSet<Character>();
		for (Character character : text.toCharArray()) {
			if (hashSet.contains(character))
				return false;
			hashSet.add(character);
		}

		return true;
	}

}
