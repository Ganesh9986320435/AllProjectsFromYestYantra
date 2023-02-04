
public class sondkmkgv {
public static void main(String[] args) {
	int a[]= {1,1,1,2,3};
	for(int i=0;i<a.length;)
	{ 
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j]) {
				int z=j;
				for(int k=0;k<a.length;k++)
				{
					if(z<a.length)
					a[k]=a[z++];
					
					
				}
				
			}
			else {
				i++;
			}
			break;
		}
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
