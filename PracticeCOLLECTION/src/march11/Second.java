package march11;

import java.util.HashMap;
import java.util.Map;

public class Second {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1,"gani");
		map.put(2, "mani");
		map.put(3, "gani");
		Map<Integer, String> map2=new HashMap<>();
		for(Integer i:map.keySet())
		{
			String s=map.get(i);
			if(!map2.values().contains(s))
			{
				map2.put(i, s);
			}
		}
		System.out.println(map2);
	}
}
