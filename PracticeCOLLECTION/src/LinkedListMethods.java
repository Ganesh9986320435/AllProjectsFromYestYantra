import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMethods {
public static void main(String[] args) {
	LinkedList linkedList=new LinkedList<>();
	linkedList.add(1);
	linkedList.add("gani");
//	ListIterator listIterator=linkedList.listIterator();
//	while(listIterator.hasNext())
//	System.out.println(listIterator.next());    //for iteration we can use both iterrator and list iterator
	
	//other methods in linked list other than arraylist
	//addfirst()
	linkedList.addFirst(50);
	
	//addlast()
	//removefirst()
	//removelast()
//	linkedList.removeFirst();
//	linkedList.removeFirst();
	
	//getfirst()
	//getlast()
//	System.out.println(linkedList.getFirst());
	
	//offer() it is similar to add if it is not added gives false
//	linkedList.offer(5);
	
	//element()
	//peek() these 2 are used to return head element
//	System.out.println(linkedList.element());  //if linked list is empty it throw exception
//	System.out.println(linkedList.peek());		//if linked list is empty it gives null
	
	//remove()
	//pool()
//	System.out.println(linkedList.remove());// to remove 1st element it throws exception but pool throws null
	System.out.println(linkedList);
	
	
	
	
}
	
	
}
