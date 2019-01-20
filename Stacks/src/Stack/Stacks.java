package stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Stacks {

	private Stack<String> stack;
	
	public static void main(String[] args) {
		Stacks cd = new Stacks();
		Stacks cd2 = new Stacks("CookiesRFun", "BartGoesToSchool", "Alphabet");
		System.out.println(cd);
		System.out.println(cd.nextCD());
		System.out.println(cd.playNextCD());
		System.out.println("\n\n");
		cd.printCDs3();
		System.out.println("\n\n");
		cd.printCDs2();
		System.out.println("\n\n");
		cd.printCDRecursive();
		cd.combineStacks(cd2);
		System.out.println("\n\n\n" + decimaltoBinary(34));
		
	}

	public Stacks() {
		stack = new Stack<String>();
		
		stack.push("Journey");
		stack.push("Iggy Pop");
		stack.push("Hall & Oats");
		stack.push("Genesis");
		stack.push("Foreigner");
		stack.push("Eagles");
		stack.push("Deep Purple");
		stack.push("Cheap Trick");
		stack.push("Beatles");
		stack.push("Aerosmith");
		
	}
	
	public Stacks(String a1, String a2, String a3) {
		stack = new Stack<String>();
		
		stack.push(a1);
		stack.push(a2);
		stack.push(a3);
		
	}
	
	public String nextCD(){
		return stack.peek();
	}
	
	public String playNextCD(){
		return stack.pop();
	}
	
	public void printCDs(){
		while(!(stack.isEmpty())){
			System.out.println(stack.pop());
		}
	}
	
	public void printCDs2(){
		Iterator<String> iter = stack.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
	
	public void printCDs3(){
		for(String a : stack){
			System.out.println(a);
		}
	}
	
	private int index;
	public void printCDRecursive(){
		index=0;
		index=stack.size();
		printCDRecursive(index);
	}
	
	public void printCDRecursive(int i){
		if(i<=1){
			System.out.println(stack.pop());
		}
		else{
			System.out.println(stack.pop());
			printCDRecursive(--i);
		}
	}
	
	public Stack<String> myStacks(){
		return stack;
	}
	
	public void reverseStack(){
		Stack<String> temp = new Stack<String>();
		while(!stack.isEmpty()){
			temp.push(stack.pop());
		}
		stack=temp;
	}
	
	public static String decimaltoBinary(int a){
		Stack<Integer> bits = new Stack<Integer>();
		while(a>0){
			bits.push(a%2);
			a/=2;
		}
		String bin="";
		while(!bits.isEmpty()){
			bin+="" + bits.pop();
		}
		return bin;
	}
	
	public void combineStacks(Stacks two){
		two.reverseStack();
		while(!two.myStacks().isEmpty()){
			stack.push(two.myStacks().pop());
		}
	}
	
	public String toString(){
		return stack.toString();
	}
	
	

}
