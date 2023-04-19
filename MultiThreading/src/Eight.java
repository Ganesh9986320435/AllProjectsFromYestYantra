
public class Eight {
	public static void main(String[] args) throws InterruptedException {
		MyThread8 myThread8=new MyThread8();
		myThread8.start();
		System.out.println("coliman");
		synchronized (myThread8) {
			myThread8.wait();
		}
		
		System.out.println("kikik");
		
	}
}
class MyThread8 extends Thread
{
	public void run()
	{
		System.out.println("hello");
		System.out.println("lala");
		synchronized (this) {
			this.notify();
		}
	}
}
