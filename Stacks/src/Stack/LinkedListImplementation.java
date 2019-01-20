package stack;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListImplementation implements myStack{
	
	private LinkedList<Object> stack;
	
	public LinkedListImplementation(){
		stack = new LinkedList<Object>();
	}

	public Object push(Object item) {
		stack.addLast(item);
		return item;
	}

	public Object pop() {
		return stack.removeLast();
	}

	public Object peek() {
		return stack.getLast();
	}

	public boolean isEmpty() {
		return stack.size()==0;
	}

	public int size() {
		return stack.size();
	}


	public int search(Object a) {
		ListIterator<Object> iter = stack.listIterator();
		int c=0;
		while(iter.hasNext()){
			iter.next();
		}
		while(iter.hasPrevious()){
			c++;
			if(iter.previous().equals(a))
				return c;
		}
		return -1;
	}
	
	public String toString(){
		String temp="[";
		ListIterator<Object> iter = stack.listIterator();
		while(iter.hasNext()){
			temp+=" " + iter.next();
		}
		temp+="]";
		return temp;
	}
	
}
