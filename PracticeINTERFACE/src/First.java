
public interface First {
	static final int a=20;
//	public abstract void m2() ;
	public abstract int m3(int x) ;

}
interface second{
	static final int a=30;
	public default void m1()
	{
		System.out.println("hi");
	}
}