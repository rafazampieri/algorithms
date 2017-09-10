package com.rafazampieri.crackingthecodeinterview;

public class Node {
	
	public Node next;
	public Integer data;
	
	public Node(Integer data){
		this.data = data;
	}
	
	public void appendToTail(Node newNode){
		Node node = this;
		while(node.next != null){
			node = node.next;
		}
		node.next = newNode;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

	@Override
	public int hashCode() {
		return this.data;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}

}
