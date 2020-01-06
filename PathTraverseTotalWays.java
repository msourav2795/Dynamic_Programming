package src;

public class PathTraverseTotalWays {

	public static int pathTraverseTotalWays(int[][] matrix) {
		int row=matrix.length;
		int col=matrix[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 || j==0) {
					continue;
				}
				else {
					matrix[i][j] = 1+ Math.max(matrix[i-1][j], matrix[i][j-1]);
				}
			}
		}
		return matrix[row-1][col-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
