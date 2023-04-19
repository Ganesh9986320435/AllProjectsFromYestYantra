import java.util.Collections;
import java.util.TreeSet;

public class Five {
	public static void main(String[] args) {
		TreeSet set=new TreeSet<>();
		set.add(2);
		set.add(1);
		System.out.println(set);
		TreeSet set2=(TreeSet)set.descendingSet();
		System.out.println(set2);
	}
}
