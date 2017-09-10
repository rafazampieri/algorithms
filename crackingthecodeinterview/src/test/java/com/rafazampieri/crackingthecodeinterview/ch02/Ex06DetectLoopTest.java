package com.rafazampieri.crackingthecodeinterview.ch02;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.rafazampieri.crackingthecodeinterview.Node;

public class Ex06DetectLoopTest {
	
	private Ex06DetectLoop solution;
	
	@Before
	public void setup(){
		solution = new Ex06DetectLoop();
	}
	
	@Test
	public void testDetectLoop(){
		// setup
		Node expectedReturnNode = new Node(-1);
		Node node = new Node(3);
		node.next = expectedReturnNode;
		
		// given
		Node head = new Node(0);
		head.appendToTail(expectedReturnNode);
		head.appendToTail(new Node(1));
		head.appendToTail(new Node(2));
		head.appendToTail(node);
		
		// when
		Node detectLoop = solution.detectLoop(head);
		
		// then
		Assert.assertTrue(detectLoop == expectedReturnNode);
	}
	
	@Test
	public void testWhenDoesntHaveLoop(){
		// given
		Node head = new Node(0);
		head.appendToTail(new Node(1));
		head.appendToTail(new Node(2));
		head.appendToTail(new Node(3));
		
		// when
		Node detectLoop = solution.detectLoop(head);
		
		// then
		Assert.assertTrue(detectLoop == null);
	}

}
