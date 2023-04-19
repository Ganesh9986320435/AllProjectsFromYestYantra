import java.util.Arrays;

public class Fifteen {
	public static void main(String[] args) {
		Integer a[][]= {{3,2,4},{4,6,2}};
		Arrays.sort(a,(Integer i1[],Integer i2[]) ->{ return Integer.compare(i1[0], i2[0]);});
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println(Integer.compare(2, 3));
	}
}
