package com.rafazampieri.crackingthecodeinterview.ch02;

import com.rafazampieri.crackingthecodeinterview.Node;

public class Ex07Palindrome {
	
	// page 78
	// Implement a function to check if a linked list is a palindrome,
	
	public boolean isPalindrome(Node head){
		if(head == null){
			return false;
		}
		
		int nodeSize = 1;
		
		Node reverse = new Node(head.data);
		Node current = head.next;
		while(current != null){
			nodeSize++;
			
			Node currentReverse = reverse;
			reverse = new Node(current.data);
			reverse.next = currentReverse;
			
			current = current.next;
		}
		
		for (int i = 0; i < (nodeSize / 2); i++) {
			if(reverse.data != head.data){
				return false;
			}
			reverse = reverse.next;
			head = head.next;
		}
		
		return true;
	}

}
