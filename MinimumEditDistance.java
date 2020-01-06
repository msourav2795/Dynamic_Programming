package src;

public class MinimumEditDistance {
	
	public static int minimumEditDistance(String str1, String str2) {
		int len1=str1.length();
		int len2=str2.length();
		int[][] matrix= new int[len1+1][len2+1];
		for(int i=0;i<=len1;i++) {
			for(int j=0;j<=len2;j++) {
				if(i==0 || j==0) {
					matrix[i][j]=(i==0)?j:i;
				}
				if(str1.charAt(i-1)==str2.charAt(j-1)) {
					matrix[i][j]=matrix[i-1][j-1];
				}
				else {
					matrix[i][j]=1+Math.min(matrix[i-1][j-1], Math.min(matrix[i-1][j], matrix[i][j-1]));
				}
			}
		}
		return matrix[len1][len2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
