
public class Six {
	public static void main(String[] args) {
		Display display=new Display();
		MyThread6 myThread6=new MyThread6(display, "gani");
		MyThread6 mThread6=new MyThread6(display, "mani");
		myThread6.start();
		mThread6.start();
	}
}
class MyThread6 extends Thread
{
	Display d;
	String name;
	public MyThread6(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class Display{
	public synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("goodmorning");
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