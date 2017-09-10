package com.rafazampieri.crackingthecodeinterview.ch02;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.rafazampieri.crackingthecodeinterview.Node;

public class Ex04SplitTwoLinkedListTest {
	
	private Ex04SplitTwoLinkedList solution;
	
	@Before
	public void setup(){
		solution = new Ex04SplitTwoLinkedList();
	}
	
	@Test
	public void testPartition(){
		// given
		Node head = new Node(7);
		head.appendToTail(new Node(3));
		head.appendToTail(new Node(6));
		head.appendToTail(new Node(2));
		head.appendToTail(new Node(9));
		
		// when
		Node result = solution.partition(head, 5);
		
		// then
		Assert.assertTrue(result.data == 3);
		Assert.assertTrue((result = result.next).data == 2);
		Assert.assertTrue((result = result.next).data == 7);
		Assert.assertTrue((result = result.next).data == 6);
		Assert.assertTrue((result = result.next).data == 9);
	}

}
