package com.rafazampieri.crackingthecodeinterview;

import org.junit.Assert;
import org.junit.Test;

public class NodeTest {
	
	@Test
	public void testAppendToTail(){
		Node head = new Node(1);
		head.appendToTail(new Node(2));
		head.appendToTail(new Node(3));
		
		Node node = head;
		Assert.assertTrue(node.data == 1);
		Assert.assertTrue((node = node.next).data == 2);
		Assert.assertTrue((node = node.next).data == 3);
	}

}
