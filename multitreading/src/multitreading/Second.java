package multitreading;

public class Second {
	public static void main(String[] args) {
		MyThread1 myThread1=new MyThread1();
		myThread1.start();
//		myThread1.setName("bye");
		System.out.println(myThread1.getName());
		MyThread1 myThread2=new MyThread1();
		myThread2.start();
		System.out.println(myThread2.getName());
	}
}
class MyThread1 extends Thread
{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("hello");
		}
	}
}