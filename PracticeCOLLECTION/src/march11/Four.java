package march11;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Four {
	public static void main(String[] args) {
		Map<Integer, Hi> map=new HashMap<>();
		map.put(1, new Hi(2,"surya bhai"));
		map.put(2, new Hi(1,"gani"));
		map.put(3, new Hi(3,"mani"));
		Optional<java.util.Map.Entry<Integer, Hi>> a5=map.entrySet().stream().max((n1,n2)->n1.getValue().id-n2.getValue().id);
		System.out.println(a5.get().getValue());
	}
}
class Hi{
	int id;
	String name;
	public Hi(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return ""+id+"="+name;
	}
}

