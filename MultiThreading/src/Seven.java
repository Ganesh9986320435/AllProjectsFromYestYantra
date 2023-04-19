
public class Seven {
	public static void main(String[] args) {
		Display1 display1=new Display1();
		MyThread7 myThread7=new MyThread7(display1, "gani");
		MyThread7 myThread72=new MyThread7(display1, "mani");
		myThread7.start();
		myThread72.start();

	}
}
class MyThread7 extends Thread{
	Display1 display1;
	String name;
	public MyThread7(Display1 display1, String name) {
		super();
		this.display1 = display1;
		this.name = name;
	}
	public void run()
	{
		display1.wish(name);
	}
}
class Display1{
	public void wish(String name)
	{
		synchronized (this) {
			System.out.println("hello");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name);
		}
	}
}