package interview;
import java.util.*;




public class Test1 {
	
	public static int countDigitFreq(int n, int d) {
	
		if(n==0 && d==0)return 1;
		
		if(n<0)n=-n;
		
		int counter=0;
		while(n!=0) {
			int digit = n%10;
			if(digit == d)counter++;
			n=n/10;
		}
		
		return counter;
	}
	
	public static void main(String args[]) {
	 
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int d= scn.nextInt();
		
		int x = countDigitFreq(n,d);
		System.out.println("the digit"+d+"occurs"+x+"times in "+n);
	}
	
	
		
	}


