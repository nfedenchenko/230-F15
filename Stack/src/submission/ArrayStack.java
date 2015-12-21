package submission;

import adt.Stack;

public class ArrayStack<T> implements Stack<T> {
	private T[] data;
	private int top;

	@Override
	public void push(T newEntry) {
		 if(top==data.length-1){
	            System.out.println("Stack is full, can't push");
	        }
	        else{

	            top=top+1;
	            data[top]=newEntry;
	        }
	}

	@Override
	public T pop() {
		if(!isEmpty())
            top=top-1;
        else{
            System.out.println("Stack is empty");
        }
		return null;
	}

	@Override
	public T peek() {
		 for(int i=0;i<=top;i++){
	            System.out.print(data[i]+ " ");
	        }
	        System.out.println();
	    
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		for (int i = 0; i < data.length; i++)
		    data[i] = null;
		
	}
	
	public String toString() {
		String s = "";
		for (int i = top; i >= 0; i--)
			s += "| " + data[i] + " |\n";
		s+= "+++++\n";
		return s;
	}

}
