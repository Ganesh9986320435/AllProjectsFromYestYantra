import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Employee1> arrayList=new ArrayList<>(100);
		
		//adding values to  the array list
//		arrayList.add(1);
//		arrayList.add(121.6);
//		arrayList.add("ghjhjiujhn");
//		arrayList.add(true);
		
		//print array list tostring is overridden in arraylist
//		System.out.println(arrayList);
		
		//to find a size of array list
//		System.out.println(arrayList.size());
		
		//to remove elements from arraylist we can pass object or index
//		System.out.println(arrayList.remove(1));
		
		//adding elements  based on index
//		arrayList.add(1, 454545455954946565l);
		
		//to get specific object get()
//		System.out.println(arrayList.get(1));   
		
		//change the object 
//		arrayList.set(1, 4585);
		
		//to serch object present in array list
//		System.out.println(arrayList.contains(4585));   //true

		//to check whether the array list is emplty are not
//		System.out.println(arrayList.isEmpty());    //false
		
		
		//to read data
//		1.forloop
//		for(int i=0;i<arrayList.size();i++)
//		System.out.println(arrayList.get(i));
		
//		2.foreach
//		for(Object o:arrayList)
//			System.out.println(o);
		
//		3.iteratormethod
//		Iterator iterator=arrayList.iterator();
//		while(iterator.hasNext())
//			System.out.println(iterator.next());
		
//		4.ListIterator
//		ListIterator listIterator=arrayList.listIterator();
//		while(listIterator.hasNext())
//			System.out.println(listIterator.next());
//		while(listIterator.hasPrevious())
//			System.out.println(listIterator.previous());
		
		
		//to sort array by using comparable and comparetomethod
//		arrayList.add(new Employee(5,"gani") );
//		arrayList.add(new Employee(1, "naru"));
//		arrayList.add(new Employee(3, "suni"));
//		Collections.sort(arrayList);
//		for(Employee employee:arrayList)
//			System.out.println(employee.id);
		
		//to sort array by using comparator and comparemethod by using another class
		arrayList.add(new Employee1(5,"gani") );
		arrayList.add(new Employee1(1, "naru"));
		arrayList.add(new Employee1(3, "suni"));
//		Collections.sort(arrayList, new IdComparator());
//		for(Employee1 employee1:arrayList)
//			System.out.println(employee1.id);
		
		
		//sorting by using comparator and lambda expression
//		Collections.sort(arrayList,(Object o1,Object o2)->{Employee1 b1=(Employee1)o1;Employee1 b2=(Employee1)o2;return(int)(b1.id-b2.id);});
//		for(Employee1 employee1:arrayList)
//			System.out.println(employee1.id);
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	}
}
