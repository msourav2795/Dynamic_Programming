package src;

public class MaximumRectagularAreaMatrix {

	public static int maximumRectangularAreaMatrix(int[][] matrix) {
		int row=matrix.length;
		int col=matrix[0].length;
		int maxArea=0;
		for(int i=0;i<row;i++) {
			if(i==0) {
				maxArea=Math.max(maxArea, MaximunAreaHistogram.maximumAreaHistogram(matrix[i]));
				continue;
			}
			for(int j=0;j<col;j++) {
				matrix[i][j]=matrix[i][j]==1?matrix[i][j]+matrix[i-1][j]:0;
			}
			maxArea=Math.max(maxArea, MaximunAreaHistogram.maximumAreaHistogram(matrix[i]));
		}
		return maxArea;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
				{1,0,0,1,1,1},
				{1,0,1,1,0,1},
				{0,1,1,1,1,1},
				{0,0,1,1,1,1}
				};
		System.out.println(maximumRectangularAreaMatrix(arr));

	}

}
