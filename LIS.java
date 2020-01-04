package src;

public class LIS {
	
	public static int lis(int[] arr) {
		int len=arr.length;
		int[] count= new int[len];
		//int[] index= new int[len];
		int max=0;
		for(int i=1;i<len;i++) {
			for(int j=0;j<i;j++) {
				count[i]=Math.max(count[i], 1+count[j]);
			}
			max=Math.max(max, count[i]);
		}
		return max+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
