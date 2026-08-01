package arrays;

public class MaxSubArray {
	public static void main(String args[]) {
		int arr[] = {1,-2,-3,-1,0,4,7,3,8,-5};
		
		int max = Integer.MIN_VALUE;
		int currentSum = 0;
		 for(int i=0; i<arr.length; i++) {
			 currentSum += arr[i];
			 if(currentSum > max) {
				 max = currentSum;
			 }
			 if(currentSum <0) {
				 currentSum=0;
			 }
		 }
		 System.out.print(max);
	}
}
