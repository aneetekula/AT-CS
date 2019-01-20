package stack;

import java.util.Stack;

public class StackMethods {

	public static double getAverage(Stack<Integer> one){
		int total=0;
		for(int a : one){
			total+=a;
		}
		return (double)total/one.size();
	}

	public static Stack<String> alternateStack (Stack<String>  one, Stack<String> two){
		return two;
		
	}
	        //Good Question: For alternating stacks, are they the same size??�Do they have to be???

		public static Stack<String> removeEveryOther(Stack<String> one){
			return one;
			
		}
		      //Removes every other element in the stack � but the order of others shouldn�t change.

		public  static void display(Stack<String> one){
			
		}
		
		public static void main(String[] args){
			Stack<Integer> a = new Stack<Integer>();
				a.push(5);
				a.push(2);
				a.push(7);
			Stack<String> b = new Stack<String>();
				b.push("one");
				b.push("two");
			Stack<String> c = new Stack<String>();
			           c.push("three");
			             c.push("four");
			             c.push("five");
			             display(alternateStack(b,c));
			System.out.println();
			Stack<String> d = new Stack<String>();
				d.push("six");
				d.push("seven");
				d.push("eight");
				d.push("nine");
				d.push("ten");
				display(removeEveryOther(d));
			}


}
