package arrays;

public class ArraySumAvg {
	public static int sumAvg(int arr[]) {
		int n = arr.length;
		int sum =0;
		float avg =0;
		for(int i=0; i<n; i++) {
			sum += arr[i];
		}
		avg = (float)sum/n;
		System.out.println("Sum is : " +sum);
		System.out.println("Average : " +avg);
		return 1;
	}
	public static void main(String args[]) {
		int arr1[] = {4,3,6,8,2,1,9,13};
		sumAvg(arr1);
	}
}
