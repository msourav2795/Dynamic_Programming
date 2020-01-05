package src;

public class MaxSumSubsequenceNonAdjacent {
	
	public static int nonSubsquenceSum(int[] arr) {
		int max=Integer.MIN_VALUE;
		int inc=Integer.MIN_VALUE,exc=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int temp=exc;
			exc=Math.max(inc, exc);
			if(temp!=Integer.MIN_VALUE)
				inc=Math.max(temp+arr[i], arr[i]);
			else
				inc=arr[i];
		}
		
		return Math.max(exc, inc);
	}

	public static void main(String[] args) {
		int arr[]={5, 5, 10, 100, 10, 5}; 
		System.out.println(nonSubsquenceSum(arr));
	}

}
