package src;

public class PathTraverseTotalWays {

	public static int pathTraverseTotalWays(int[][] matrix) {
		int row=matrix.length;
		int col=matrix[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 || j==0) {
					matrix[i][j]=1;
				}
				else{
					matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
				}
			}
		}
		return matrix[row-1][col-1];
	}
	
	public static void main(String[] args) {
		int[][] arr= new int[4][4];
		System.out.println(pathTraverseTotalWays(arr));

	}

}
