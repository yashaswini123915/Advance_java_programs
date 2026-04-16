package interview;
import java.util.*;




public class Test1 {
	public static void main(String args[]) throws Exception {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter your n value");
		int n= scn.nextInt();
		int [] arr = new int[n];
		
		//input the array
		for(int i=0;i<n;i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("the reversed array is");
		int i=0;
		int j=arr.length-1;
		
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
	    	
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}
}
