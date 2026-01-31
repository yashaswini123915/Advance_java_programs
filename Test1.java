package MethodandConstructor;
import java.util.*;

public class Test1 {
	
	public void Averageandcount(){
		int number[]= {10,20,30,40,50};
		double sum =0;
		int count =0;
		for(int i:number) {
			sum=sum+i;
			count=count+1;
		}
		double avg=sum/count;
		System.out.println("average of the array: "+avg);
	}
	void Max_min_value() {
		int arr[]= {14,7,23,11,29};
		int Max=arr[0];
		int Min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>Max) {Max=arr[i];}
			if(arr[i]<Min) {Min=arr[i];}
		}
		System.out.println("max and min values are = " +Max+" , "+Min);
	}
	void Secondlargestnumber() {
		int arr[]= {12,35,1,10,34,1};
		int largest=Integer.MIN_VALUE;
		int Secondlargerst=Integer.MAX_VALUE;
		for(int num:arr) {
			if(num>largest) {
				Secondlargerst=largest;
				largest=num;
			}
			else if(num>Secondlargerst && num!=largest ) {
				Secondlargerst=num;
			}
		}
		System.out.println("secondlargest number= "+Secondlargerst);
	}
	void Movingzerostoend() {
		int arr[]= {0,1,0,3,12};
		int pos=0;
		for(int num:arr) {
			if(num!=0) {
				arr[pos++]=num;
			}
			
		}
		while(pos<arr.length) {
			arr[pos++]=0;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");

		}
		
	}
	void Mergingstring(String s1,String s2) {
		String S1=s1;
		 String S2=s2;
		 String result;
		 if(S1.length()==S2.length()) {
			  result=" ";
		 
		 for (int i=0;i<S1.length();i++) {
			 result +=S1.charAt(i);
			 result +=S2.charAt(i);
			 
		 }
		 System.out.println(result);
		 
		 }
		 else {
			 System.out.println("error check your string");
		 }
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Test1 t =new Test1();
t.Averageandcount();
t.Movingzerostoend();
t. Max_min_value();
t.Secondlargestnumber();
System.out.println("enter s1 and s2 values");
String a=sc.next();
String b=sc.next();
t.Mergingstring(a,b);


		
	}

}
