import java.util.HashMap;

public class Second {
	public static void main(String[] args) {
		HashMap<Integer, Integer> hashMap=new HashMap<>();
		hashMap.put(1, 1);
		System.out.println(hashMap);
		hashMap.remove(1);		
		System.out.println(hashMap);
	}
}
