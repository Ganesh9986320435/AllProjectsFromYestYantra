
public interface D 
{
	void m1();
}
interface P
{
	void m2();
}
class H implements D , P
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}
	
}
