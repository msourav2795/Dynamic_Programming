package src;

public class SubsetSum {
	
	public static boolean subsetSum(int[] arr, int sum) {
		int len=arr.length;
		boolean[][] matrix= new boolean[len+1][sum+1];
		for(int i=0;i<=len;i++) {
			for(int j=0;j<=sum;j++) {
				if(j==0) {
					matrix[i][j]=true;
				}
				else if(i==0) {
					matrix[i][j]=false;
				}
				else if(arr[i-1]>j) {
					matrix[i][j]=matrix[i-1][j];
				}
				else {
					//System.out.println(j+"   "+arr[i-1]);
					matrix[i][j]=matrix[i-1][j] || matrix[i-1][j-arr[i-1]];
				}
			}
		}
		return matrix[len][sum];
	}

	public static void main(String[] args) {
		int arr[] = {2, 3, 7, 8};
        System.out.print(subsetSum(arr, 14));
	}

}
