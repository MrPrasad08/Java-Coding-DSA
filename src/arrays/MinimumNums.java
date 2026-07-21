package arrays;

public class MinimumNums {
	public static int smallest(int arr[]) {
		int n = arr.length;
		int smallest = arr[0];
		int secondSmallest = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i] <= smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}
			else if(arr[i] < secondSmallest && arr[i]!=smallest) {
				secondSmallest = arr[i];
			}
		}
		System.out.println("Smallest : " +smallest);
		System.out.println("Second Smallest : " +secondSmallest);
		return 0;
	}
	public static void main(String args[]) {
//		MinimumNums obj = new MinimumNums();
		int arr1[] = {4,9,0,3,2,5,-1};
		smallest(arr1);
	}
}
