
public class Interview {
	public static void main(String[] args) {
		String string[]= {"1a","2b","5c"};
		for(int i=0;i<string.length;i++)
		{
			int count=0;
			char ch=' ';
			count=Integer.parseInt(string[i].charAt(0)+"");
			ch=string[i].charAt(1);
			System.out.print(count+"->");
				for(int j=0;j<count;j++)
				{
					System.out.print(ch);
				}
				System.out.println();
		}
	}
}
