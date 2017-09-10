package com.rafazampieri.crackingthecodeinterview.ch02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.rafazampieri.crackingthecodeinterview.Node;

public class Ex01RemoveDuplicates {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		list.forEach(Ex01RemoveDuplicates::preencherCamposAuditoria);
	}
	
	public static void preencherCamposAuditoria(String text){
		System.out.println(text);
	}
	
	public static void update(String text){
		System.out.println("update: " + text);
	}

	// Write code to remove duplicates from an unsorted linked list. 
	// FOLLOW UP
	// How would you solve this problem if a temporary buffer is not allowed
	
	public Node removeDuplicatesWithoutBuffer(Node head){
		if(head == null || head.next == null){
			return head;
		}
		
		Node node = head;
		while(node != null){
			removeEqualsNodes(node, node.data);
			node = node.next;
		}
		
		return head;
	}
	
	private void removeEqualsNodes(Node head, Integer data){
		Node node = head;
		while(node.next != null){
			if(node.next.data == data){
				node.next = node.next.next;
				if(node.next == null){
					break;
				}
			}
			node = node.next;
		}
	}
	
	public Node removeDuplicates(Node head){
		if(head == null || head.next == null){
			return head;
		}
		
		Set<Integer> setNodes = new HashSet<>();
		setNodes.add(head.data);
		
		Node node = head;
		while(node.next != null){
			if(setNodes.contains(node.next.data)){
				node.next = node.next.next;
				if(node.next == null){
					break;
				}
			} else {
				setNodes.add(node.data);
			}
			node = node.next;
		}
		
		return head;
	}
	

}
