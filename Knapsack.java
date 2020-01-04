package src;

public class  Knapsack {
	
	public static int knapsack(int[] weight, int[] value, int tw) {
		int len=weight.length;
		int[][] matrix= new int[len+1][tw+1];
		for(int i=1;i<=len;i++) {
			for(int j=1;j<=tw;j++){
				if(weight[j]<j) {
					matrix[i][j]=matrix[i-1][j];
				}
				else {
					matrix[i][j]=Math.max(matrix[i-1][j], value[j]+matrix[i-1][j-weight[j]]);
				}
			}
		}
		
		return matrix[len][tw];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
