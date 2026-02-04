package thread1;
 import java.lang.*;

 class thread3 extends Thread {
	
	public void run(){
	{
	System.out.println("thread is running"+Thread.currentThread());
     }
	}
	class main{
		public static void main(String arg[]) {
			thread3 t1=new thread3();
			thread3 t2=new thread3();
			
			t1.start();
			t2.start();
		}
	}
   }

