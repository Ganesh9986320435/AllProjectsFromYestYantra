import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class First {
	public static void main(String[] args) {
		List list=new ArrayList<>();
		list.add('a');
		list.add('z');
		list.add('j');
		Collections.sort(list);
		for (Object object : list) {
			System.out.println(object);
		}		
	}
}
