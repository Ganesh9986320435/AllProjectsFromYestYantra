
public class First {
	static int a = 20;
	int b = 30;

	public First() {
		// TODO Auto-generated constructor
		System.out.println("ikik");
	}

	public static void main(String[] args) {
		StringBuffer stringBuffer=new StringBuffer("hi");
		stringBuffer.append("a");
		String string="kdfkf";
		for(int i=0;i<string.length();i++)
		{
			
		}
		System.out.println("hello");
		First first = new First();
		System.out.println("bye");
		U u = new U();
	}

	static {
		System.out.println("bhgdsbhaj");
		a = 30;
		First first = new First();
		first.b = 60;
	}
	{
		System.out.println("jhudhfjsik");
		b = 50;
		a = 80;
	}
}

class U {
	static {
		System.out.println("ijuhbvgdsbhaj");
	}
	{
		System.out.println("ooooooo");
	}
}