import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AddingTest {
	@Test
	void addTest()
	{
		Adding adding=new Adding();  
		assertEquals(4, adding.add(2, 2));
	}
}
