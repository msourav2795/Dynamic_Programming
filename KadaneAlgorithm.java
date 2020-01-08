package src;

public class KadaneAlgorithm {
	
	public static int kadaneAlgorithm(int[] arr) {
		int maxSum=0, currSum=0;
		for(int i=0;i<arr.length;i++) {
			currSum=Math.max(arr[i], currSum+arr[i]);
			maxSum=Math.max(maxSum, currSum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		System.out.println(kadaneAlgorithm(arr));
	}

}
