package march7th;

import java.util.Scanner;

public class CountingDuplicates {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=scanner.nextInt();
		int a[]=new int[size];
		System.out.println("enter the numbers in to array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter "+(i+1)+"st number");
			a[i]=scanner.nextInt();
		}
		System.out.println("enter the number which u need to find duplicates");
		int duplicate=scanner.nextInt();
		System.out.println("output is: "+findCount(a,duplicate));
	}
	public static int findCount(int a[], int duplicate)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==duplicate)
				count++;
		}
		return count;
	}
}
