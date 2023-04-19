import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class Second {
	public static void main(String[] args) {
		HashSet<Employee12> hashSet=new HashSet<>();
		hashSet.add(new Employee12(1, "gANI"));		
		hashSet.add(new Employee12(18, "mANI"));		
		hashSet.add(new Employee12(81, "pANI"));		
		hashSet.add(new Employee12(81, "dANI"));		
		hashSet.add(new Employee12(16, "pANI"));		

		Stream<Employee12> stream=hashSet.stream();
		Stream<Employee12> stream2=stream.sorted();
		Stream<Employee12> stream3=stream2.filter(n -> n.id%2==0);
		stream3.forEach(n -> { System.out.println(n);});
		
		
		
		
		
		
	}
}
class Employee12 implements Comparable<Employee12>{
	int id;
	String name;
	public Employee12(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	@Override
	public int compareTo(Employee12 o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
}
