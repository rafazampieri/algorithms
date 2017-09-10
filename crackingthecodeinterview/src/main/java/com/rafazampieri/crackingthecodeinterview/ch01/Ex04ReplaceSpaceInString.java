package com.rafazampieri.crackingthecodeinterview.ch01;

public class Ex04ReplaceSpaceInString {

	// page 73
	// Write a method to replace all spaces in a string with'%20'. You may
	// assume that the string has sufficient space at the end of the string to
	// hold the additional characters, and that you are given the "true" length
	// of the string. (Note: if imple- menting in Java, please use a character
	// array so that you can perform this opera- tion in place.)
	//
	// EXAMPLE
	// Input:"Mr John Smith Output: "Mr%20D ohn%20 Smith"

	public String replaceSpaceInString(String text) {
		char[] charArray = text.toCharArray();
		Integer countSpaceOnTheEnd = 0;

		int i = charArray.length - 1;
		for (; i >= 0; i--) {
			if (charArray[i] == ' ') {
				countSpaceOnTheEnd++;
			} else if (countSpaceOnTheEnd % 2 != 0) {
				throw new StringIndexOutOfBoundsException();
			} else {
				break;
			}
		}

		for (; i >= 0; i--) {
			if (charArray[i] == ' ') {
				if (countSpaceOnTheEnd == 0) {
					throw new StringIndexOutOfBoundsException();
				}
				charArray[i + countSpaceOnTheEnd] = '0';
				countSpaceOnTheEnd--;
				charArray[i + countSpaceOnTheEnd] = '2';
				countSpaceOnTheEnd--;
				charArray[i + countSpaceOnTheEnd] = '%';
				continue;
			}

			charArray[i + countSpaceOnTheEnd] = charArray[i];
		}

		if (countSpaceOnTheEnd > 0) {
			throw new StringIndexOutOfBoundsException();
		}

		return String.valueOf(charArray);
	}

}
