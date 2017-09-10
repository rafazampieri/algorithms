package com.rafazampieri.crackingthecodeinterview.ch02;

import com.rafazampieri.crackingthecodeinterview.Node;

public class Ex04SplitTwoLinkedList {
	
	// page 77
	// Write code to partition a linked list around a value x, such that all
	// nodes less than x come before alt nodes greater than or equal to x.

	public Node partition(Node head, int x) {
		Node headOfBefore = null;
		Node before = null;
		Node headOfAfter = null;
		Node after = null;
		
		Node node = head;
		while (node != null) {
			if(node.data < x){
				if(headOfBefore == null){
					headOfBefore = node;
					before = headOfBefore;
				} else {
					before.next = node;
					before = node;
				}
			} else {
				if(headOfAfter == null){
					headOfAfter = node;
					after = headOfAfter;
				} else {
					after.next = node;
					after = node;
				}
			}
			node = node.next;
		}
		
		before.next = headOfAfter;
		return headOfBefore;
	}

}
