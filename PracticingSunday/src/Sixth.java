
class Sixth {
	public static void main(String[] args) {
		int a[][]=new int[4][4];
		int z=3;
		int count=1;
		int iterate=0;
			for(int i=z;i>=0;i--)
			{
				if(iterate%2==0)
				{
					for(int j=z;j>=0;j--)
					{
						a[j][i]=count++;
					}
				}else {
					for(int j=0;j<=z;j++)
					{
						a[j][i]=count++;
					}
					
				}
				iterate++;	
			}
			for(int i=0;i<=3;i++)
			{
				for(int j=0; j<=3;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
			
			
		
	
		
	}
}
