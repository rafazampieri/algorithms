package com.rafazampieri.crackingthecodeinterview.ch02;

import com.rafazampieri.crackingthecodeinterview.Node;

public class Ex06DetectLoop {

	// page 78
	// Given a circular linked list, implement an algorithm which returns the
	// node at the beginning of the loop.
	
	// Solution: Fast Runner / Slow Runner
	
	public Node detectLoop(Node head){
		if(head == null || head.next == null){
			return null;
		}
		
		Node slow = head.next;
		Node fast = head.next.next;
		
		while(slow != fast){
			if(fast.next == null || fast.next.next == null){
				return null;
			}
			
			slow = slow.next;
			fast = fast.next.next;
		}
		
		slow = head;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow;
	}

}
