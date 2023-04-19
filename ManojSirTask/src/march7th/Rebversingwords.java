package march7th;

import java.util.Scanner;

public class Rebversingwords {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string");
		String string=scanner.nextLine();
		System.out.println("updated string: "+reverseWord(string));
	}
	public static String reverseWord(String word)
	{
		String s[]=word.split(" ");
		String updatedString="";
		for(int i=s.length-1;i>=0;i--)
		{
			updatedString=updatedString+" "+s[i];
		}
		return updatedString;
	}
}
