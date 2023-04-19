
public class eleven {
	public static void main(String[] args) {
		int num=5;
		int space=num-1;
		int star=1;
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print("  ");
			}
			for(int k=0;k<star;k++)
			{
				if(k==0||k==star-1)
				System.out.print("* ");
				else 
					System.out.print("  ");
			}
			space-=1;
			star+=2;
			System.out.println();
		}
		int space1=1;
		int star1=num*2-3;
		for(int i=num-2;i>=0;i--)
		{
			for(int j=0;j<space1;j++)
			{
				System.out.print("  ");
			}
			for(int k=0;k<star1;k++)
			{
				if(k==i)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			space1+=1;
			star1-=2;
			System.out.println();
		}
		
		int i[]= {1,2,3};
		i.push(5);
		

	}
}
