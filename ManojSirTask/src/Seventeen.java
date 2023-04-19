import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Seventeen {
	public static void main(String[] args) {
		List<Product> list=Arrays.asList(new Product("aphone", "apple", 2000),new Product("iphone", "apple", 15000),new Product("iphone", "apple", 20000));
//		double add=0;
//		for(Product p:list)
//		{
//			add+=p.price;
//		}
//		System.out.println(add);
		
//		System.out.println(list.stream().mapToDouble(n ->n.price));
//		List<Integer> list2=Arrays.asList(1,2,3,5,8,8,5,4,8,8,4,5,5,4);
//		System.out.println(list2.stream().filter(n -> {return (n%2==0);}).mapToInt(n->n).sum());
		
//		System.out.println(list.stream().filter(n -> n.price<3000).count());
		
		
//		Product p3= list.stream().max(( p1, p2 ) ->(int)(p1.price-p2.price)).get();
		
//		Product p3= list.stream().max(( p1, p2 ) ->(int)(p2.price-p1.price)).get();  or min
//		System.out.println(p3);
		
		
		
//		list.stream().filter(n -> n.name.startsWith("a")).forEach(n -> System.out.println(n));
		
		
//		List<List<Product>> list2=Arrays.asList(list,list);
//		System.out.println(list2.stream().flatMap(n ->list.stream()).collect(Collectors.toList()));
		
		Map<Integer , String> map=new HashMap<>();
		map.put(2,"gakn");
		map.put(1, "mani");
		Set<Map.Entry<Integer, String>>set=map.entrySet();
		set.stream().sorted((e1,e2)-> e1.getValue().compareTo(e2.getValue())).forEach(n->System.out.println(n));
		
		
		

		
		
		
	}
}
