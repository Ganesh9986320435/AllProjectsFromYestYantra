package log4j;

import java.util.Scanner;

public class Sosodics {
	public static void main(String[] args) {
		int count=0;
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the size");
	int size=scanner.nextInt();
	int a[]=new int[size];
	for(int i=0;i<a.length;i++)
	{
		System.out.println("enter the "+(i+1)+"st number");
		a[i]=scanner.nextInt();
	}
	System.out.println("enter the finding number");
	int num=scanner.nextInt();
	for(int i=0;i<a.length;i++)
	{
		if(num==a[i])
		count++;
	}
	if(count==1) {
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==num) {
			System.out.println("it is at index "+i);
		}
	}
	}
	else{
		for(int i=0;i<a.length;i++)
		{
			if(num<a[i])
			{
				System.out.println("it is at the index "+i);
				break;
			}
		}
	}
	}
}
