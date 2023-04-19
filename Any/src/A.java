
public class A {
	public static void main(String[] args) {
		int a=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++){
				if(a%2==1)
				System.out.print("* ");
				else 
				System.out.print("$ ");
				a++;
			}
			System.out.println();

		}
	}
}
