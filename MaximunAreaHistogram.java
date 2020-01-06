package src;

import java.util.Stack;

public class MaximunAreaHistogram {
	
	public static int maximumAreaHistogram(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		int maxArea=0,i=0;
		while(i<arr.length) {
			if(stack.isEmpty() || arr[stack.peek()] <= arr[i]) {
				stack.push(i++);
			}
			else {
				int tp=stack.pop();
				int area=arr[tp]*(stack.isEmpty()?i:(i-stack.peek()-1));
				maxArea=Math.max(area, maxArea);
			}
		}
		while(!stack.isEmpty()) {
			int tp=stack.pop();
			int area=arr[tp]*(stack.isEmpty()?i:(i-stack.peek()-1));
			maxArea=Math.max(area, maxArea);
		}
		
		
		return maxArea;
	}
	
	public static void main(String[] args) {
		int hist[] = {6, 2, 5, 4, 5, 1, 6}; 
		System.out.println(maximumAreaHistogram(hist));
	}
}
