package multitreading;

public class Six {
	public static void main(String[] args) {
		Display display=new Display();
		MyThread5 myThread1 = new MyThread5(display,"ganesh");
		myThread1.start();
		display.m1("hi");
	}
}

class MyThread5 extends Thread {
	Display display;
	String name;
	public MyThread5(Display display,String name) {
		this.display = display;
		this.name=name;
	}

	@Override
	public void run() {
		display.m1(name);
	}
}

class Display {
	
	public synchronized void m1(String name) {
		for(int i=0;i<10;i++)
		{
			
			System.out.println(name);
		}
		
		synchronized(Display.class) {
			
		}
			
	}
}