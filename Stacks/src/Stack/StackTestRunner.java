package stack;

import static java.lang.System.*;

public class StackTestRunner
{
	public static void main ( String[] args )
	{
		String a="a b c d e f g h i";
		System.out.println(a + "\n");
		StackTest test = new StackTest(a);
		test.popEmAll();
		a="1 2 3 4 5 6 7 8 9 10";
		System.out.println("\n\n" + a + "\n");
		test.setStack(a);
		test.popEmAll();
		a="# $ % ^ * ( ) ) _";
		System.out.println("\n\n" + a + "\n");
		test.setStack(a);
		test.popEmAll();
	}
}
