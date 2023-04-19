import java.util.ArrayList;
import java.util.HashMap;

public class six {
	public static void main(String[] args) {
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(5, 1);
		map.put(2, 2);
		map.put(3, 2);
		map.put(4, 2);
		ArrayList<Integer> arrayList=new ArrayList<>();
		for(Integer i1:map.keySet())
		{
			int count=0;
			for(Integer i2:map.keySet())
			{
				if(map.get(i1)==map.get(i2))
				count++;	
			}
			if(count>1)
			{
				int iterate=0;
				for(Integer i3:arrayList)
				{
					if(map.get(i1)==map.get(i3))
						iterate++;
				}
				if(iterate==0)
				arrayList.add(i1);
			}
		}
		for(Integer i:arrayList)
		{
			map.remove(i);
		}
		System.out.println(map);
	}
}
