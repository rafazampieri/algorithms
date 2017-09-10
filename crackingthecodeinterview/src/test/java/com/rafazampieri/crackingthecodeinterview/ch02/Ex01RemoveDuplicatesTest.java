package com.rafazampieri.crackingthecodeinterview.ch02;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.rafazampieri.crackingthecodeinterview.Node;

public class Ex01RemoveDuplicatesTest {
	
	private Ex01RemoveDuplicates solution;
	
	@Before
	public void setup(){
		solution = new Ex01RemoveDuplicates();
	}
	
	@Test
	public void testWhenHasOneNode(){
		// given
		Node head = new Node(1);
		
		// when
		Node node = solution.removeDuplicates(head);
		
		// then
		Assert.assertTrue(node != null);
	}
	
	@Test
	public void testWithouBufferWhenHasOneNode(){
		// given
		Node head = new Node(1);
		
		// when
		Node node = solution.removeDuplicatesWithoutBuffer(head);
		
		// then
		Assert.assertTrue(node != null);
	}
	
	@Test
	public void testWhenHeadIsNull(){
		// given
		Node head = null;
		
		// when
		Node node = solution.removeDuplicates(head);
		
		// then
		Assert.assertTrue(node == null);
	}
	
	@Test
	public void testWithouBufferWhenHeadIsNull(){
		// given
		Node head = null;
		
		// when
		Node node = solution.removeDuplicatesWithoutBuffer(head);
		
		// then
		Assert.assertTrue(node == null);
	}
	
	@Test
	public void testWhenHasTwoEqualsNodes(){
		// given
		Node head = new Node(1);
		head.appendToTail(new Node(1));
		
		// when
		Node node = solution.removeDuplicates(head);
		
		// then
		assertWhenHasTwoEqualsNodes(node);
	}
	
	@Test
	public void testWithouBufferWhenHasTwoEqualsNodes(){
		// given
		Node head = new Node(1);
		head.appendToTail(new Node(1));
		
		// when
		Node node = solution.removeDuplicatesWithoutBuffer(head);
		
		// then
		assertWhenHasTwoEqualsNodes(node);
	}

	private void assertWhenHasTwoEqualsNodes(Node node) {
		Assert.assertTrue(node != null);
		Assert.assertTrue(node.next == null);
	}
	
	@Test
	public void testWhenHasTwoDiffNodes(){
		// given
		Node head = new Node(1);
		head.appendToTail(new Node(2));
		
		// when
		Node node = solution.removeDuplicates(head);
		
		// then
		assertWhenHasTwoDiffNodes(node);
	}
	
	@Test
	public void testWithoutBufferWhenHasTwoDiffNodes(){
		// given
		Node head = new Node(1);
		head.appendToTail(new Node(2));
		
		// when
		Node node = solution.removeDuplicatesWithoutBuffer(head);
		
		// then
		assertWhenHasTwoDiffNodes(node);
	}

	private void assertWhenHasTwoDiffNodes(Node node) {
		Assert.assertTrue(node != null);
		Assert.assertTrue(node.data == 1);
		Assert.assertTrue(node.next != null);
		Assert.assertTrue(node.next.data == 2);
	}
	
	@Test
	public void testWhenHasTwoNodesToRemove(){
		// given
		Node head = new Node(1);
		head.appendToTail(new Node(2));
		head.appendToTail(new Node(1));
		head.appendToTail(new Node(3));
		head.appendToTail(new Node(4));
		head.appendToTail(new Node(5));
		head.appendToTail(new Node(4));
		
		// when
		Node node = solution.removeDuplicates(head);
		
		// then
		assertwhenHasTwoNodesToRemove(node);
	}
	
	@Test
	public void testWithouBufferWhenHasTwoNodesToRemove(){
		// given
		Node head = new Node(1);
		head.appendToTail(new Node(2));
		head.appendToTail(new Node(1));
		head.appendToTail(new Node(3));
		head.appendToTail(new Node(4));
		head.appendToTail(new Node(5));
		head.appendToTail(new Node(4));
		
		// when
		Node node = solution.removeDuplicatesWithoutBuffer(head);
		
		// then
		assertwhenHasTwoNodesToRemove(node);
	}

	private void assertwhenHasTwoNodesToRemove(Node node) {
		Assert.assertTrue(node.data == 1);
		Assert.assertTrue((node = node.next).data == 2);
		Assert.assertTrue((node = node.next).data == 3);
		Assert.assertTrue((node = node.next).data == 4);
		Assert.assertTrue((node = node.next).data == 5);
		Assert.assertTrue((node = node.next) == null);
	}

}
