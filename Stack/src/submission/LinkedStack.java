package submission;

import adt.Stack;

public class LinkedStack<T> implements Stack<T> {
	private Node top;
	
	@Override
	public void push(T newEntry) {
		Node n = new Node(newEntry);
	    n.next = top;
	    top = n;
		
	}

	@Override
	public T pop() {
		while(!isEmpty()){
		top = top.next;}
		return null;
	}

	@Override
	public T peek() {
		Node current = top;
	    while (current != null) {
	        System.out.print(current);
	        System.out.print("	");
	        current = current.next;
	    }
		return null;
	}

	@Override
	public boolean isEmpty() {
		
		return false;
	}

	@Override
	public void clear() {
		top = null;
	}
	
	public String toString() {
		String s = "";
		for (Node n = top; n != null; n = n.next)
			s += "| " + n.data + " |\n";
		s+= "+++++\n";
		return s;
	}
	
	private class Node 
	{
	  private T    data; // Entry in bag
	  private Node next; // Link to next node

		private Node(T dataPortion)
		{
			this(dataPortion, null);	
		} // end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor
	} // end Node

}
