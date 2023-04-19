package March14;

import March9.main;

public class Second {
	public static void main(String[] args) {
		String string="68451540";
		System.out.println(Second.DashInsertII(string));
	}

	private static StringBuffer DashInsertII(String string) {
		StringBuffer stringBuffer=new StringBuffer();
		for(int i=0;i<string.length()-1;i++)
		{
			stringBuffer.append(string.charAt(i));
			if(string.charAt(i)%2==0&&string.charAt(i+1)%2==0)
			{
				stringBuffer.append('*');
			}
			if(string.charAt(i)%2!=0&&string.charAt(i+1)%2!=0)
			{
				stringBuffer.append('-');
			}
		}
		stringBuffer.append(string.charAt(string.length()-1));
		return stringBuffer;
	}
}
