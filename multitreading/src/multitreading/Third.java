package multitreading;

public class Third {
	public static void main(String[] args) {
		MyThread2 myThread2=new MyThread2();
		myThread2.start();
		myThread2.setPriority(4);
		for(int i=0;i<10;i++)
		{
			System.out.println("usdbhajn");
		}
	}
}
class MyThread2 extends Thread
{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("hello");
		}
	}
}
