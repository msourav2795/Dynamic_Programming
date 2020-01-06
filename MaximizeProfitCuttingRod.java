package src;

public class MaximizeProfitCuttingRod {
	
	public static int maximizeProfitCuttingRod(int[] size, int[] price, int tl) {
		int[][] matrix= new int[size.length+1][tl+1];
		for(int i=1;i<=size.length;i++) {
			for(int j=1;j<tl;j++) {
				if(size[i]<j) {
					matrix[i][j]=matrix[i-1][j];
				}
				else {
					matrix[i][j]=Math.max(matrix[i-1][j], price[i]+ matrix[i][j-size[i]]);
				}
			}
		}
		
		return matrix[size.length][tl];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
