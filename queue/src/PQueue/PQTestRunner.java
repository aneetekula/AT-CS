package PQueue;

public class PQTestRunner
{
	public static void main ( String[] args )
	{
		String a = "enfield abhi charlie bob donald";
		String b = "one two three four five six seven";
		String c = "1 2 3 4 5 one two three four five";
		String d = "a p h j e f m c i d k l g n o b";

		PQTester pqueue = new PQTester(d);
		System.out.println("To String : " + pqueue);
		System.out.println("Get Min : " + pqueue.getMin());
		System.out.println("Get Natural Order: " + pqueue.getNaturalOrder());
	}
}