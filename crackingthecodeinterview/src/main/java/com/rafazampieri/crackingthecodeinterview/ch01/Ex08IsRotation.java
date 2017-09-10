package com.rafazampieri.crackingthecodeinterview.ch01;

public class Ex08IsRotation {

	// page 74
	// Assume you have a method isSubstring which checks if one word is
	// a substring of another. Given two strings, si and s2, write code to check
	// If s2 is a rotation of s1 using only one call to isSubstring (e.g.,
	// "waterbottLe" is a rotation of "erbottLewat").

	public boolean isRotation(String s1, String s2) {
		int len = s1.length();
		/* check that si and s2 are equal length and not empty */
		if (len == s2.length() && len > 0) {
			/* concatenate si and si within new buffer */
			String s1s1 = s1 + s1;
			return s1s1.contains(s2);
		}
		return false;
	}

}
