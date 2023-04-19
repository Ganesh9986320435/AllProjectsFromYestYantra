import java.util.Comparator;

public class IdComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee1 employee1=(Employee1)o1;
		Employee1 employee2=(Employee1)o2;
		return employee1.id-employee2.id;

	}
}
