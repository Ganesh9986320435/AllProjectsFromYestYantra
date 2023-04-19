package march6th;

public class MethodHiding extends Heelo{
	public static void m1()
	{
		System.out.println("hi");
	}
	public static void main(String[] args) {
		Heelo h=new MethodHiding();
		MethodHiding methodHiding=(MethodHiding)h;
		methodHiding.m1();
	}
}
class Heelo{
	public static void m1()
	{
		System.out.println("hello");
	}
}