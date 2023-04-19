import java.util.Arrays;

public class Interview2 {
	public static void main(String[] args) {
		String s[] = { "aba", "mmn", "zyz" };
		for (int i = 0; i < s.length; i++) {
			char[] ch=s[i].toCharArray();
			int a[]=new int[ch.length];
			for(int j=0;j<ch.length;j++)
			{
				a[i]=ch[i];
			}
			int b[]=Arrays.stream(a).distinct().toArray();
			String s2="";
			for(int j=0;j<b.length;j++)
			{
			s2=(char)b[j]+"";
			}
			s[i]=s2;
		}
		for (String s1 : s) {
			System.out.println(s1.toString());
		}
		
	}
}
