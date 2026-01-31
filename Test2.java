package MethodandConstructor;

public class Test2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int [][]original= { {1,2} ,{3,4},{4,5}};
		int rows = original.length;
		int cols=original[0].length;
		// the transpose will have 2rows and 3 columns
		int[][] transpose = new int[cols][rows];		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				transpose[j][i]=original[i][j];
			}
		}
		
		System.out.println("transpose matrix");
		for(int[] row :transpose){
			for(int element:row) {                       // this case study
				System.out.print(element+" ");
			}
			System.out.println();
		}
		}

}
