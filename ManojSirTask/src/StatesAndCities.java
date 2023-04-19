import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StatesAndCities {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String city = scanner.next();
		Map<String, List<String>> map = new HashMap<>();
		List<String> karList = new ArrayList<>();
		karList.add("banglore");
		karList.add("ballari");
		List<String> tamList = new ArrayList<>();
		tamList.add("chennai");
		tamList.add("ooty");
		map.put("karnataka", karList);
		map.put("tamilnadu", tamList);		
		for(String s1:map.keySet())
		{
			for (String c : map.get(s1)) {
				if(c.equals(city))
				{
					System.out.println(s1);
				}
			}
		}
			}
}


	

