package MethodandConstructor;

public class D3X3array {

	public static void rotate(int[][] matrix) {
		// TODO Auto-generated method stub
		
	
			int n=matrix.length;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					int temp = matrix[i][j];
					matrix[j][i]=temp;
				}
			}
			for(int i=0;i<n;i++) {                        // 1 2 5
				for(int j=0;j<n/2;j++) {                  // 2 3 6
					int temp=matrix[i][j];                // 3 4 7
					matrix[i][j]=matrix[i][n-1-j];        // wanted to change rows to columns and columns to rows
					matrix[i][n-1-j]=temp;
				}
			}
	}
	public static void printMatrix(int[][] matrix) {
		for(int[] row:matrix) {
			for (int val:row) {
				System.out.print(val+" ");
			}
			System.out.println();		}
	}
	
	
	public static void main(String[] args) {

		int[][] matrix= { {1,2,3},{2,3,4},{5,6,7}};
		for(int[] row:matrix) {
			for (int val:row) {
				System.out.print(val+" ");
			}
			System.out.println();		
			}
		System.out.println();		

		
		rotate(matrix);
		printMatrix(matrix);

}
}
