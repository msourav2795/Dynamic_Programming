package src;

public class MaximumSumSubectangularMatrix {
	
	public static int maximumSumSubRectangularMatrix(int[][] matrix) {
		int row= matrix.length;
		int col=matrix[0].length;
		int[] arr=new int[col];
		int maxSum=0;
		for(int i=0;i<row;i++) {
			arr=new int[col];
			for(int j=i;j<row;j++) {
				for(int k=0;k<col;k++) {
					arr[k]+=matrix[j][k];
					//System.out.print(arr[k]+"\t");
				}
				//System.out.println();
				maxSum=Math.max(maxSum, KadaneAlgorithm.kadaneAlgorithm(arr));
				//System.out.println(maxSum);
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int input[][] = {{ 2,  1, -3, -4,  5},
		                { 0,  6,  3,  4,  1},
		                { 2, -2, -1,  4, -5},
		                {-3,  3,  1,  0,  3}};
		System.out.println(maximumSumSubRectangularMatrix(input));

	}

}
