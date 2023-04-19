
public class First {
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread=new MyThread();
		myThread.start();
		Thread.sleep(1000);
		System.out.println("parent thread");
	}
}
class MyThread extends Thread
{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
