import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Second {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1, "gani"));
		list.add(new Employee(2, "mani"));
		System.out.println(list);
		TreeSet<Employee> set=new TreeSet<Employee>(list);
		System.out.println(set);
		
	}
}
