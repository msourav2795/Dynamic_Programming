package src;

public class MinimumNumberOfCoins {
	
	public static int minimumNumberOfCoins(int[] coins, int sum) {
		int len=coins.length;
		int[][] matrix= new int[len+1][sum+1];
		for(int i=1;i<=len;i++) {
			for(int j=1;j<=sum;j++) {
				if(coins[i-1]<j) {
					matrix[i][j]=matrix[i-1][j];
				}
				else {
					matrix[i][j]=Math.min(matrix[i-1][j], matrix[i][j-coins[i-1]]);
				}
			}
		}
		return matrix[len][sum];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
