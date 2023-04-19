package multitreading;

public class Fourth {
	public static void main(String[] args) {
		MyThread3 myThread3=new MyThread3();
		myThread3.start();
		Thread.currentThread().yield();
			for(int i=0;i<10;i++)
			{
				System.out.println("jhkjhg");
			}
	}
}
class MyThread3 extends Thread
{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("hello");
		}
	}
}