import java.util.Arrays;
import java.util.List;

public class Eighteen {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,5,8,9,4,5);
		list.stream().filter(n->n%2==0).mapToDouble(n->Math.sqrt((double)n)).forEach(n->System.out.println(n));
	}
	
	
	
	
}
