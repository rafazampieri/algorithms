package com.rafazampieri.crackingthecodeinterview;

public class TestUtils {
	
	public static String generateTextWithAllLetters(){
		StringBuilder textWithAllLetters = new StringBuilder();
		for(int i = 'a'; i <= 'z'; i++){
			textWithAllLetters.append((char) i); 
		}
		return textWithAllLetters.toString();
	}
	
	public static String generateTextWith256Characters(){
		StringBuilder textWith256Characters = new StringBuilder(256); 
		for (int i = 0; i < 256; i++) {
			textWith256Characters.append((char) i);
		}
		return textWith256Characters.toString();
	}

}
