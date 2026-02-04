package thread1;
import java.lang.*;

class thread2 implements Runnable {
 
	public void run() {
		System.out.println("thread is running.");
	}
	public static void main(String args[]) {
		thread2 obj = new thread2();
		Thread th = new Thread(obj);
		th.start();
	}

}
