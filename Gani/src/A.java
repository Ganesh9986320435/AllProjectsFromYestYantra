
public interface A
{
	int i=20;
	void m1();
	void m2();
}
interface Test extends A
{
	int j=20;
	void m3();
}
class B implements Test
{

	@Override
	public void m1() {
		System.out.println("welcome");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		System.out.println("getout");
		// TODO Auto-generated method stub
		
	}
	@Override

	public void m3()
	{
		System.out.println("gone case");
	}
	
}

