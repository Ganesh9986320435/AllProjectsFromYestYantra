
public class Second {
	public static void main(String[] args) {
		MyThread1 myThread1=new MyThread1();
		Thread thread=new Thread(myThread1);
		thread.start();
		System.out.println(Thread.currentThread().getName());
		
	}
}
class MyThread1 implements Runnable{
	@Override
	public void run() {
		Thread.currentThread().setName("lol");
			System.out.println(Thread.currentThread().getName());
	}
}
