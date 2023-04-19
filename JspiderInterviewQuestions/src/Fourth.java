import java.util.Arrays;

public class Fourth {
	public static void main(String[] args) {
		String s1="welcome to     india";
		String string="";
		for(int i=s1.length()-1;i>=0;i--) {
			string=string+s1.charAt(i);
		}
		System.out.println(s1);
		
		char c[]=string.toCharArray();
		char c1[]=new char[c.length];
		int k=0;
		for(int i=0;i<c.length;i++)
		{
			int count=0;
			for(int j=0;j<c1.length;j++)
			{
				if(c[i]==c1[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				c1[k++]=c[i];
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c1[i]);
		}
	}
}
