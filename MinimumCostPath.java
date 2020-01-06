package src;

public class MinimumCostPath {
	
	public static int minimumCostPath(int[][] arr) {
		int row=arr.length;
		int col=arr[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 && j==0) {
					continue;
				}
				else if(i==0) {
					arr[i][j] += arr[i-1][j];
				}
				else if(j==0) {
					arr[i][j] += arr[i-1][j];
				}
				else {
					arr[i][j] += Math.max(arr[i-1][j], arr[i][j-1]);
				}
			}
		}
		
		return arr[row][col];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
