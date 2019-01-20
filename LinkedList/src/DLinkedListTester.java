import java.util.ListIterator;
public class DLinkedListTester {

	public static void main(String[] args) {
		DLinkedList list = new DLinkedList();
		ListIterator iter = list.listIterator();
		
		iter.add("Abhinav");
		

		
		//list.addLast("Abhinav");
		list.addFirst("Barath");
		list.addFirst("Abhinav");
		//list.addLast("Abhinav");
		
		System.out.println(list);
		
		
	}

}
