import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Third {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(4);
		int a[]=new int[list.size()];
		int k=0;
		for(int i:list)
		{
			a[k++]=i;
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		Arrays.stream(a).forEach(n->System.out.println(n));
		
		}
}
