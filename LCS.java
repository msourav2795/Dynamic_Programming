package src;

public class LCS {
	
	public static int lcs(int[] arr1, int[] arr2) {
		int len1=arr1.length;
		int len2=arr2.length;
		int[][] matrix= new int[len1+1][len2+1];
		for(int i=1;i<=len1;i++) {
			for(int j=1;j<=len2;j++){
				if(arr1[i]==arr2[j]) {
					matrix[i][j]=1+matrix[i-1][j-1];
				}
				else {
					matrix[i][j]=Math.max(matrix[i-1][j], matrix[i][j-1]);
				}
			}
		}
		
		return matrix[len1][len2];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
