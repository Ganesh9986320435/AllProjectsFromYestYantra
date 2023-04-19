package march11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seven {
	public static void main(String[] args) {
		String string="hi my my nane is is";
		String string2[]=string.split(" ");
		List<String> list=new ArrayList<>();
		for(String s:string2)
		{
			int count=0;
			for(String s1:string2)
			{
				if(s.equals(s1))
				{
					count++;
				}
			}
			if(count>1)
			{
				if(!list.contains(s))
				{
					list.add(s);
				}
			}
		}
		
		System.out.println(list);
	}
}
