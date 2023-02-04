
public class Employee implements Comparable {
 int id;
 String name;
 public Employee( int id,String name) {
	 this.id=id;
	 this.name=name;
 
 }
@Override
public int compareTo(Object o) {
	Employee employee=(Employee)o;
	return this.id-employee.id;
}
}
