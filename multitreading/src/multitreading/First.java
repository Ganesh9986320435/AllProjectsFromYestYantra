package multitreading;

public class First {
	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		myThread.start();
		AnotherThread anotherThread=new AnotherThread();
		Thread thread=new Thread(anotherThread);
		thread.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("hi");
		}
	}
}
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("bye");
		}
	}
}
class AnotherThread implements Runnable
{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("lol");
		}
	}
	
}