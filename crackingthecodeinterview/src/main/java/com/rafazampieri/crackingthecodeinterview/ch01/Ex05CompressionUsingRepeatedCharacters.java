package com.rafazampieri.crackingthecodeinterview.ch01;

public class Ex05CompressionUsingRepeatedCharacters {

	// page 73
	// Implement a method to perform basic string compression using the counts
	// of repeated characters. For example, the string aabcccccaaa would become
	// a2blc5a3. If the "compressed" string would not become smaller than the
	// original string, your method should return the original string.
	
	public String countRepeatedCharactersWithStringBuffer(String text){
		if(text == null || text.length() < 1){
			return text;
		} else if (text.length() == 2){
			char[] charArray = text.toCharArray();
			return charArray[0] == charArray[1] ? charArray[0] + "2" : text;
		}
		
		StringBuilder result = new StringBuilder();
		
		char[] charArray = text.toCharArray();
		char currentChar = charArray[0];
		Integer countRepeatedChars = 1;
		for (int i = 1; i < charArray.length; i++) {
			if(currentChar == charArray[i]){
				countRepeatedChars++;
			} else if (result.length() + 4 > charArray.length) {
				return text;
			} else {
				result.append(currentChar);
				result.append(countRepeatedChars);
				currentChar = charArray[i];
				countRepeatedChars = 1;
			}
		}
		result.append(charArray[charArray.length-1]);
		result.append(countRepeatedChars);
		
		return result.toString();
	}
	
	public String countRepeatedCharactersWithoutStringBuffer(String text){
		if(text == null) return null;
		
		char[] charArray = text.toCharArray();
		
		Integer sizeOfResultCharArray = countSizeOfRepeatedChars(charArray);
		if(sizeOfResultCharArray > charArray.length){
			return text;
		}
		
		char currentChar = charArray[0];
		Integer countRepeatedChars = 1;
		char[] resultCharArray = new char[sizeOfResultCharArray];
		Integer resultCharArrayPosition = 0;
		for (int i = 1; i < charArray.length; i++) {
			if(currentChar == charArray[i]){
				countRepeatedChars++;
			} else {
				resultCharArrayPosition = setChars(resultCharArray, resultCharArrayPosition, currentChar, countRepeatedChars);
				currentChar = charArray[i];
				countRepeatedChars = 1;
			}
		}
		setChars(resultCharArray, resultCharArrayPosition, currentChar, countRepeatedChars);
		
		return String.valueOf(resultCharArray);
	}

	private Integer setChars(char[] resultCharArray, Integer resultCharArrayPosition, char currentChar, Integer countRepeatedChars) {
		resultCharArray[resultCharArrayPosition++] = currentChar;
		char[] charArrayOfCount = countRepeatedChars.toString().toCharArray();
		for (char charOfNumber: charArrayOfCount) {
			resultCharArray[resultCharArrayPosition++] = charOfNumber;
		}
		return resultCharArrayPosition;
	}

	private Integer countSizeOfRepeatedChars(char[] charArray) {
		Integer sizeOfResultCharArray = 0;
		Integer countRepeatedChars = 1;
		char currentChar = charArray[0];
		for (int i = 1; i < charArray.length; i++) {
			if(currentChar == charArray[i]){
				countRepeatedChars++;
			} else {
				sizeOfResultCharArray++;
				sizeOfResultCharArray += countRepeatedChars.toString().length(); 
				currentChar = charArray[i];
				countRepeatedChars = 1;
			}
		}
		sizeOfResultCharArray++;
		sizeOfResultCharArray += countRepeatedChars.toString().length();
		
		return sizeOfResultCharArray;
	}
	
	
	
}
