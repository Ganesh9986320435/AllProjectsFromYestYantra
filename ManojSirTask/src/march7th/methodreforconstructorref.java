package march7th;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class methodreforconstructorref {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.forEach(System.out::println);
		List<String> names = Arrays.asList("John", "Jane", "Bob");
		List<Person> persons = names.stream().map(Person::new).collect(Collectors.toList());
		System.out.println(persons);
	}
}
class Person
{
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
