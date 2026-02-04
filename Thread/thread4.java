package thread1;
import java.lang.*;

class thread4 extends Thread {

	
	
	public static void main(String args[]) {
		thread4 th = new thread4();
		thread4 th2 = new thread4();
		
		th.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(th.currentThread());
		
		th.start();
		System.out.println(th2.currentThread());
		
		th2.start();
	}
}
class main{
	public void run() {
		System.out.println("thread is running"+Thread.currentThread().getPriority());
	}
	
}