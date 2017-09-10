package com.rafazampieri.crackingthecodeinterview.ch02;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.rafazampieri.crackingthecodeinterview.Node;

public class Ex02FindNthToLastElementTest {
	
	private Ex02FindNthToLastElement solution;
	
	@Before
	public void setup(){
		solution = new Ex02FindNthToLastElement();
	}
	
	@Test
	public void testfindNthToLastElement(){
		// given
		Node head = new Node(3);
		head.appendToTail(new Node(2));
		head.appendToTail(new Node(1));
		
		// when
		Node resultIndex2 = solution.findNthToLastElement(head, 2);
		Node resultIndex1 = solution.findNthToLastElement(head, 1);
		Node resultIndex0 = solution.findNthToLastElement(head, 0);
		
		// then
		Assert.assertTrue(resultIndex2.data == 3);
		Assert.assertTrue(resultIndex1.data == 2);
		Assert.assertTrue(resultIndex0.data == 1);
	}
	
	@Test
	public void testWhenHeadNodeIsNull(){
		Node head = null;
		
		Node node = solution.findNthToLastElement(head, 0);
		
		Assert.assertTrue(node == null);
	}
	
	@Test
	public void testWhenIndexIsLessThanZero(){
		Node head = new Node(1);
		
		Node node = solution.findNthToLastElement(head, -1);
		
		Assert.assertTrue(node == null);
	}

}
