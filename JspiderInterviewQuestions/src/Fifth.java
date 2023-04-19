import java.util.Arrays;

public class Fifth {
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7,8,9,10};
		int num=3;
		int arr1[]= new int[num];
		int first=0;
		int arr2[]=new int[num];
		int second=0;
		
		int arr3[]=new int[num];
		int third=0;
		int arr4[]=new int[num];
		int fourth=0;
		int k=num;
		for(int i=0;i<arr.length;i++)
		{
			if(i>=0&&i<k)
			{
				arr1[first++]=arr[i];
			}
			else if (i>=k&&i<k+num) {
				arr2[second++]=arr[i];
			}
			else if (i>=k+num&&i<k+num+num) {
				arr3[third++]=arr[i];
			}
			else {
				arr4[fourth++]=arr[i];
			}
		}
		Arrays.stream(arr1).forEach(n->System.out.print(n));
		System.out.println();
		Arrays.stream(arr2).forEach(n->System.out.print(n));
		System.out.println();
		for(int i=0;i<arr3.length;i++)
		{
			if(arr3[i]!=0)
			{
				System.out.print(arr3[i]);
			}
		}		System.out.println();
		for(int i=0;i<arr4.length;i++)
		{
			if(arr4[i]!=0)
			{
				System.out.println(arr4[i]);
			}
		}
	}
}
