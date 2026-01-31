package MethodandConstructor;

public class FibonoccisRecursion {
	public static int calculateFibonaccis(int n) {
		if(n<=1) {
			return n;
		}
		return (calculateFibonaccis(n-1)+calculateFibonaccis(n-2));	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=10;
		System.out.println("fibonoccis sequence"+count);
		for(int i=0;i<count;i++) {
			System.out.print( calculateFibonaccis(i)+" ");
		}
	}
}
