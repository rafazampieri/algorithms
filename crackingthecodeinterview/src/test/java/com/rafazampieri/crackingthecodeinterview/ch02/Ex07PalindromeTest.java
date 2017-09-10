package com.rafazampieri.crackingthecodeinterview.ch02;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.rafazampieri.crackingthecodeinterview.Node;

public class Ex07PalindromeTest {
	
	private Ex07Palindrome solution;
	
	@Before
	public void setup(){
		solution = new Ex07Palindrome();
	}
	
	@Test
	public void testIsPalindrome1(){
		// given
		Node head = new Node(0);
		head.appendToTail(new Node(1));
		head.appendToTail(new Node(2));
		head.appendToTail(new Node(1));
		head.appendToTail(new Node(0));
		
		// when
		boolean isPalindrome = solution.isPalindrome(head);
		
		// then
		Assert.assertTrue(isPalindrome);
	}
	
	@Test
	public void testIsPalindrome2(){
		// given
		Node head = new Node(0);
		head.appendToTail(new Node(1));
		head.appendToTail(new Node(1));
		head.appendToTail(new Node(0));
		
		// when
		boolean isPalindrome = solution.isPalindrome(head);
		
		// then
		Assert.assertTrue(isPalindrome);
	}

	@Test
	public void testNoIsPalindrome1(){
		// given
		Node head = new Node(0);
		head.appendToTail(new Node(1));
		head.appendToTail(new Node(2));
		head.appendToTail(new Node(4));
		head.appendToTail(new Node(0));
		
		// when
		boolean isPalindrome = solution.isPalindrome(head);
		
		// then
		Assert.assertFalse(isPalindrome);
	}
	
	@Test
	public void testNoIsPalindrome2(){
		// given
		Node head = new Node(0);
		head.appendToTail(new Node(1));
		head.appendToTail(new Node(4));
		head.appendToTail(new Node(0));
		
		// when
		boolean isPalindrome = solution.isPalindrome(head);
		
		// then
		Assert.assertFalse(isPalindrome);
	}
}
