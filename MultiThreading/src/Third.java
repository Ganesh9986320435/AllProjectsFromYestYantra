
public class Third {
	public static void main(String[] args) {
		MyThread3 myThread3=new MyThread3();
		myThread3.start();
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("hello");
	}
}
class MyThread3 extends Thread
{
	@Override
	public void run() {
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("hi");
	}
}
