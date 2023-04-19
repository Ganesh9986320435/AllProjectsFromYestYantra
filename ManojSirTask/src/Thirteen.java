import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Thirteen {
	public static void main(String[] args) {
		Set<Product> set=new HashSet<>();
		set.add(new Product("mobile", "Apple", 20999));
		set.add(new Product("watch", "Apple", 9999));
		set.add(new Product("ipad", "Apple", 50999));
		set.add(new Product("headset", "Apple", 15000));
		set.add(new Product("gogles", "Apple", 5999));
		set.stream().filter(n->n.price>10000).forEach(n ->System.out.println(n));
//		System.out.println(set.stream().filter(n->n.price>10000).collect(Collectors.toList()));
	}
}
class Product
{
	String name;
	String manufacturename;
	double price;
	
	public Product(String name, String manufacturename, double price) {
		super();
		this.name = name;
		this.manufacturename = manufacturename;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", manufacturename=" + manufacturename + ", price=" + price + "]";
	}
	
}
