
public class Four {
	public static void main(String[] args) throws InterruptedException {
		MyThread4 myThread4=new MyThread4();
		myThread4.start();
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
			Thread.yield();
			System.out.println("hello");
		}
	}
}
class MyThread4 extends Thread
{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hi");
		}
	}
}