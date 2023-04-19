import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Four {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(1);
		list.add(2);
		list.addFirst(100);
		List list1=new ArrayList<>();
		list1.add(1);
		list1.add(3);
//		list.retainAll(list1);
		System.out.println(list);		
		}
}
