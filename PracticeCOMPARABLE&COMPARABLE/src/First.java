import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class First {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>();
		a1.add(new Book("gani", 10));
		a1.add(new Book("mani", 8));
		a1.add(new Book("kani", 9));
		a1.add(new Book("dani", 1));
		Collections.sort(a1, (Object o1,Object o2)->{Book b1=(Book)o1;Book b2=(Book)o2;return(int)(b1.id-b2.id);});
		for (Object object : a1) {
			System.out.println(object);
		}
	}
}

