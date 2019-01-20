package stack;

public class LinkedListImplementationTester {

	public static void main(String[] args){

		LinkedListImplementation tc = new LinkedListImplementation();

		
		
		System.out.println(tc.push(new String("quarter")));

		System.out.println(tc.push(new String("dime")));

		System.out.println(tc.push(new String("nickel")));

		System.out.println(tc.push(new String("penny")));

		System.out.println( "toString() " + tc.toString());
		
		
		System.out.println( "peek() " + tc.peek());

		System.out.println( "search for dime " + tc.search(new String("dime")));

		System.out.println( "search for euro " + tc.search(new String("euro")));

		System.out.println( "Size " + tc.size());

		//System.out.println("pop() and isEmpty()" + tc.pop() + tc.isEmpty());

		while (!tc.isEmpty()){

			System.out.println(tc.pop());
		}
		
	}

}
