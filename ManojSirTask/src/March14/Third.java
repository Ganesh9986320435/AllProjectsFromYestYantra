package March14;

public class Third {
	public static void main(String[] args) {
		int n=9;
		int num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++) {
				if(i==j||(i+j)==(n+1))
				{
					System.out.print(num);
				}
				else {
					System.out.print(" ");
				}
			}
			if(i<5)
			{
				num++;
			}
			else {
				num--;
			}
			System.out.println();	
		}
	}
}
