package src;

public class MaximumSquareAreaMatrix {
	
	public static int maximumSquareAreaMatrix(int[][] matrix) {
		int row=matrix.length;
		int col=matrix[0].length;
		int maxArea=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 || j==0) {
					continue;
				}
				else if(matrix[i][j]!=0){
					matrix[i][j]=1+Math.min(matrix[i-1][j], Math.min(matrix[i-1][j-1], matrix[i][j-1]));
					maxArea=Math.max(maxArea, matrix[i][j]);
				}
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int arr[][] = {{0,1,1,0,1},{1,1,1,0,0},{1,1,1,1,0},{1,1,1,0,1}};
		System.out.println(maximumSquareAreaMatrix(arr));

	}

}
