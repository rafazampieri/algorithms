package com.rafazampieri.crackingthecodeinterview.ch02;

import com.rafazampieri.crackingthecodeinterview.Node;

public class Ex05CalculateSum {

	// page 77
	// You have two numbers represented by a linked list, where each node
	// contains a singledigit.The digits are stored in reverse order,such that the
	// 1's digit is at the head of the list. Write a function that adds the two
	// numbers and returns the sum as a linked list.
	
	public Node calculateReverseOrder(Node number1, Node number2){
		if(number1 == null && number2 == null){
			return null;
		}
		
		Node currentNode = null;
		
		int rest = 0;
		while(number1 != null || number2 != null){
			int data = 0;
			if(number1 != null && number2 != null){
				int sum = number1.data + number2.data + rest;
				
				data = sum % 10;
				rest = sum / 10;
				
				number1 = number1.next;
				number2 = number2.next;
			} else if(number1 != null){
				int sum = number1.data + rest;
				data = sum % 10;
				rest = sum / 10;
				number1 = number1.next;
			} else {
				int sum = number2.data + rest;
				data = sum % 10;
				rest = sum / 10;
				number2 = number2.next;
			}
			Node node = currentNode;
			currentNode = new Node(data);
			currentNode.next = node;
		}
		
		if(rest != 0){
			Node node = currentNode;
			currentNode = new Node(rest);
			currentNode.next = node;
		}
		
		return currentNode;
	}
	
	public Node calculate(Node number1, Node number2){
		if(number1 == null && number2 == null){
			return null;
		}
		
		
		return null;
	}
	

}
