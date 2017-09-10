package com.rafazampieri.crackingthecodeinterview.ch02;

import com.rafazampieri.crackingthecodeinterview.Node;

public class Ex02FindNthToLastElement {

	// page 77
	// Implement an algorithm to find the kth to last element of a singly linked
	// list.

	// Note that for this solution, we have defined k such that passing in k = 0
	// would return the last element, k = 1 would return to the second to last
	// element, and so on.
	
	public Node findNthToLastElement(Node head, int index){
		if(head == null || index < 0){
			return null;
		}
		
		Node currentNode = head;
		if(index > 0){
			for (int i = 0; i < index; i++) {
				if(currentNode.next != null){
					currentNode = currentNode.next;
				} else {
					return null;
				}
			}
		}
		
		Node nthNode = head; 
		while(currentNode.next != null){
			currentNode = currentNode.next;
			nthNode = nthNode.next;
		}
		
		return nthNode;
	}

}
