import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Fourteen {
	public static void main(String[] args) {
		List< Employee> list=Arrays.asList(new Employee(1, "gani", 9986320435l,20000),new Employee(2, "phani", 5455523565l,98653),new Employee(3, "naru", 6859585459l,78585),new Employee(4, "pavani", 7586959598l,15896));
		list.stream().sorted((Employee e1,Employee e2) ->{return (int) (e1.sal-e2.sal);}).forEach(n -> System.out.println(n));
	}
}
class Employee implements Comparable<Employee>{
	int id;
	String name;
	long phone;
	double sal;
	public Employee(int id, String name, long phone,double sal) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.sal=sal;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", sal=" + sal + "]";
	}
	
	
}
