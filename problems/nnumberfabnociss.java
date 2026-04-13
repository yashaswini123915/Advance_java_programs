package interview;
import java.util.*;

public class Test1 {
	public static void main(String args[]) {
	    // This syntax ensures the scanner closes automatically
	    try (Scanner sc = new Scanner(System.in)) {
	        if (!sc.hasNextInt()) return;
	        int n = sc.nextInt();
	        
	        int a = 0, b = 1;

	        if (n <= 0) {
	            System.out.println("Please enter a positive integer.");
	        } else {
	            System.out.println("Fibonacci Sequence up to " + n + " terms:");
	            for (int i = 1; i <= n; i++) {
	                System.out.print(a + " ");
	                int next = a + b;
	                a = b;
	                b = next;
	            }
	        }
	    } // Scanner closes here automatically
	}

}
