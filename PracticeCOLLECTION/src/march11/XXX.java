package march11;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class XXX {
	public static void main(String[] args) {
		Map<Integer, Employee> map=new HashMap<>();
		map.put(1, new Employee(1, "gani", 1000));
		map.put(12, new Employee(12, "2ani", 800));
		map.put(13, new Employee(13, "gsasaani", 1000));
		map.put(14, new Employee(154, "gzani", 1000));
		map.entrySet().stream().map(n->{if(n.getValue().sal==1000) {
			n.getValue().sal=2000;
			return n;	
		}
		else {
			return n;
		}}).forEach(n->System.out.println(n));
		}
	}
class Employee{
	int id;
	String name;
	int sal;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
}
