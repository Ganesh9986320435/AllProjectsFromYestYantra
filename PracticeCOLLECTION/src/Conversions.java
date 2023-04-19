import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class Conversions {
public static void main(String[] args) {
	ArrayList<Employee> arrayList=new ArrayList<>();
	arrayList.add(new Employee(1, "gani") );
	arrayList.add(new Employee(2, "mani") );
	arrayList.add(new Employee(2, "mani") );
//	arrayList.add("kuni");
//	arrayList.add(1);
//	arrayList.add("kuni");

	
	
	
	
//	LinkedList linkedList=new LinkedList<>(arrayList);
	//converting arraylist to linked list
//	System.out.println(linkedList);  // [1, gani] //possible
	
	
	
	//converting array list to hashset
//	HashSet hashSet=new HashSet<>(arrayList);
//	System.out.println(hashSet);				//possible
	
	
	//converting array list to treeset
//	TreeSet<Employee1> treeSet=new TreeSet<>(arrayList);
//	for(Employee1 employee:treeSet)
//	System.out.println(employee.name);  //it is possible for comparable primitive types and for objects if the object is implements comparable interface it is possible if comparable interface is not extended it is not possible
	
	
//	TreeSet treeSet=new TreeSet<>();
//	treeSet.add(1);
//	treeSet.add("gani");
//	System.out.println(treeSet);  //it is not possible because the data is not comparable type
	
	
	//converting arraylist to LinkedHashset
//	LinkedHashSet linkedHashSet=new LinkedHashSet<>(arrayList);
//	System.out.println(linkedHashSet);        //insertion order is maintained duplicates not allowed    //possible
	
	
	//converting array list to priority queue
//	PriorityQueue<Employee> priorityQueue=new PriorityQueue<>(arrayList);
////	for(Employee employee:priorityQueue)
////	System.out.println(employee.id);
//	System.out.println(priorityQueue);   //insertion order maintained duplicates allowed comparable type i.e homogeneous
	
	
	//converting array list to map
//	HashMap hashMap=new HashMap<>(arrayList);
//	TreeMap<Integer, String> treeMap=new TreeMap<>(arrayList);
//	Hashtable<Integer, String> hashtable=new Hashtable<>(arrayList);
	//this is not possible we need to do by using for each loop i.e
	
//	HashMap< Integer, String> hashMap=new HashMap<>();
//	for(Employee employee1:arrayList)
//		hashMap.put(employee1.id, employee1.name);
//	System.out.println(hashMap);    
	
//	TreeMap< Integer, String> treeMap=new TreeMap<>();
//	for(Employee employee1:arrayList)
//		treeMap.put(employee1.id, employee1.name);
//	System.out.println(treeMap);   //if it is of comparable type
	
	
	
	
	
	
	
	
	
	
	
}
}
