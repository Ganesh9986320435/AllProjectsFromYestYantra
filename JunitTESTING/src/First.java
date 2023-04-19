import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class First {
@Test
	public void findAdd()
	{
		assertEquals(4,A.add(2, 2));
		assertEquals(6, A.add(3, 3));
	}
}
class A{
	public static int add(int a,int b)
	{
		return a+b;
	}
}