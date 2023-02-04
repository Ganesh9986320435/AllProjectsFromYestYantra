import java.util.Comparator;

public class Id implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee employee=(Employee)o1;
		Employee employee2=(Employee)o2;
		return employee.name.compareTo(employee2.name);
	}


}
