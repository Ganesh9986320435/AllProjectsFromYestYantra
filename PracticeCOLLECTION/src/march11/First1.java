package march11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class First1 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(30);
		List<Integer> list2=new ArrayList<>();
		for(Integer i:list)
		{
			if(!list2.contains(i))
				list2.add(i);
		}
		System.out.println(list2);
	}
}