package arrays;

public class LargeNum {
	public int largeNum(int arr[]) {
		int n = arr.length;
		int large = arr[0];
		int secondlarge = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i] >= large) {
				secondlarge = large;
				large = arr[i];
			}
			else if(arr[i] > secondlarge && arr[i]!=large) {
				secondlarge = arr[i];
			}
		}
		System.out.println("Largest is : " +large);
		System.out.println("Second Largest : " +secondlarge);
		return 0;
	}
	public static void main(String args[]) {
		LargeNum obj = new LargeNum();
		int arr1[]= {20,15,8,60,55,90,80};
		obj.largeNum(arr1);
	}
}
