import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Third {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "gani"));
		list.add(new Employee(3, "pani"));
		list.add(new Employee(2, "aani"));
		Collections.sort(list, new Id());
		for(Employee employee:list)
		System.out.println(employee.name);
		Collections.sort(list);
		for(Employee employee:list)
		System.out.println(employee.id);
	
	
	}
}
