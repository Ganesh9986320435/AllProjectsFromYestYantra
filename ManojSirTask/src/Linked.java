import java.util.LinkedHashSet;

public class Linked {
	public static void main(String[] args) {
		LinkedHashSet set=new LinkedHashSet<>();
		set.add(3);
		set.add(2);
		System.out.println(set);
		set.stream().sorted().forEach(System.out::println);
		System.out.println(set);
	}
}
