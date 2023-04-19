package innerclasses;

public class First {
	int x=30;
	static int xxy=20;
	class Hello
	{
		int y=x;
	}
	static class hi
	{
		First first=new First();
		int k=xxy;
		void m1()
		{
			System.out.println("jewcejh");
		}
	}
	public static void main(String[] args) {
//		First first=new First();
//		Hello hello=first.new Hello();
		hi hi=new hi();
		System.out.println(hi.k);
		hi.m1();
		System.out.println(y);
	}
	public void m2()
	{
		System.out.println(y);
	}
}
