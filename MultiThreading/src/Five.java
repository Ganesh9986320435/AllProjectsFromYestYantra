
public class Five {
	public static void main(String[] args) throws InterruptedException {
		MyThread5 myThread5=new MyThread5();
		myThread5.start();
		System.out.println("hello");
		myThread5.join();
		System.out.println("hello1");
	}
}
class MyThread5 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("hi");
		}
	}
}
