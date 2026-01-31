package MethodandConstructor;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= { {1,2} ,{3,4},{4,5}};
		int totalsum=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				totalsum= totalsum+a[i][j];
			}
		}
		System.out.println("totalsum of the 2d array= "+totalsum);
		
		

	}

}
