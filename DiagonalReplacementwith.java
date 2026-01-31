package MethodandConstructor;

public class DiagonalReplacementwith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] matrix= { {1,2,3},{2,3,4},{5,6,7},{1,2,3},{2,3,4},{5,6,7}}; it is not possible to print * at diagonal because diagonal is not possible in 
		int[][] matrix= { {1,2,3},{2,3,4},{5,6,7}};
		int n= matrix.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<matrix[i].length;j++) {
			//for(int j=0;j<n;j++) {
			  if (i==j) {
				  System.out.print("* ");
			  }
			  else {
				  System.out.print(matrix[i][j]+" ");
			  }
			}
			System.out.println();
		}

	}

}
