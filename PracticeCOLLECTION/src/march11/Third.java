package march11;

import java.util.HashMap;
import java.util.Map;

public class Third {
	public static void main(String[] args) {
		String val="gani";
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "gani");
		map.put(2, "mani");
		map.put(3, "gani");
		Map<Integer, String> map2=new HashMap<>();
		for(Integer i:map.keySet()){
			String s1=map.get(i);
			if(s1.equals(val))
				map2.put(i, s1);
		}
		System.out.println(map2);
	}
}
