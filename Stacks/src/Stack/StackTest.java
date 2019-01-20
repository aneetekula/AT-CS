package stack;

import java.util.Stack;
import static java.lang.System.*;

public class StackTest
{
	private Stack<String> stacks;

	public StackTest()
	{
		stacks = new Stack<String>();
		setStack("");
	}

	public StackTest(String line)
	{
		stacks = new Stack<String>();
		setStack(line);
	}
	
	public void setStack(String line)
	{
		String[] elements = line.split(" ");
		for(String a : elements){
			stacks.push(a);
		}
	}

	public void popEmAll()
	{
		while(!stacks.isEmpty()){
			System.out.print(" " + stacks.pop());
		}
	}

	//add a toString
}