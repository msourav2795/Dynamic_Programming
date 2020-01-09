package src;

public class EggDropProblem {
	
	public static int eggDropProblem(int floor, int eggs) {
		int[][] matrix= new int[eggs+1][floor+1];
		for(int i=1;i<=eggs;i++) {
			for(int j=1;j<=floor;j++) {
				if(i==1) {
					matrix[i][j]=j;
					continue;
				}
				else if(j<i) {
					matrix[i][j]=matrix[i-1][j];
				}
				else {
					matrix[i][j]=Integer.MAX_VALUE;
					for(int k=1;k<=j;k++) {
						matrix[i][j]=Math.min(matrix[i][j],  1+Math.max(matrix[i-1][k-1],matrix[i][j-k]));
					}
				}			
			}
		}
//		for(int i=0;i<=eggs;i++) {
//			for(int j=0;j<=floor;j++) {
//				System.out.print(matrix[i][j]+"\t");
//			}
//			System.out.println();
//		}
		return matrix[eggs][floor];
	}

	public static void main(String[] args) {
		System.out.println(eggDropProblem(6, 2));
	}

}
