package thread1;

import java.lang.*;
class thread1 extends Thread { 
	public void run() {
		System.out.println("thread is running");
	}
	public static void main(String arg[]) {
		thread1 T = new thread1();
		T.start();
		
	}

}
