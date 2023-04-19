package multitreading;

import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Stack;

import javax.management.Query;

public class Seven {
	public static void main(String[] args) {
		MyThread7 myThread7 = new MyThread7();
		myThread7.start();
		PriorityQueue queue=new PriorityQueue<>();
		queue.add(1);
		queue.add(2);
		System.out.println(queue.peek());
		System.out.println(queue.peek());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		Stack stack=new Stack<>();
	}
}

class MyThread7 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hi");
		}
		MyThread8 myThread8 = new MyThread8();
		myThread8.start();
		synchronized (myThread8) {
			try {
				myThread8.wait();
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("hello");
		}
	}
}

class MyThread8 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("bye");
		}

		synchronized (this) {

			this.notifyAll();;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("goodbye");
		}

	}
}
