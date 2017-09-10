package com.rafazampieri.crackingthecodeinterview.ch02;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.rafazampieri.crackingthecodeinterview.Node;

public class Ex05CalculateSumTest {
	
	private Ex05CalculateSum solution;
	
	@Before
	public void setup(){
		solution = new Ex05CalculateSum();
	}
	
	@Test
	public void testSumWithSameSize(){
		Node head1 = new Node(2);
		head1.appendToTail(new Node(5));
		head1.appendToTail(new Node(1));
		
		Node head2 = new Node(8);
		head2.appendToTail(new Node(4));
		head2.appendToTail(new Node(2));
		
		Node result = solution.calculateReverseOrder(head1, head2);
		
		Assert.assertTrue(result.data == 4);
		Assert.assertTrue((result = result.next).data == 0);
		Assert.assertTrue((result = result.next).data == 0);
	}
	
	@Test
	public void testSumWhereTheHead1IsLarger(){
		Node head1 = new Node(2);
		head1.appendToTail(new Node(5));
		
		Node head2 = new Node(8);
		head2.appendToTail(new Node(4));
		head2.appendToTail(new Node(2));
		
		Node result = solution.calculateReverseOrder(head1, head2);
		
		Assert.assertTrue(result.data == 3);
		Assert.assertTrue((result = result.next).data == 0);
		Assert.assertTrue((result = result.next).data == 0);
	}
	
	@Test
	public void testSumWhereTheHead2IsLarger(){
		Node head1 = new Node(2);
		head1.appendToTail(new Node(5));
		head1.appendToTail(new Node(1));
		
		Node head2 = new Node(8);
		head2.appendToTail(new Node(4));
		
		Node result = solution.calculateReverseOrder(head1, head2);
		
		Assert.assertTrue(result.data == 2);
		Assert.assertTrue((result = result.next).data == 0);
		Assert.assertTrue((result = result.next).data == 0);
	}

}
