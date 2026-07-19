package arrays;

public class SubArrays {
	public void subarrays(int arr[]) {
		int n= arr.length;
		for(int len = 1; len<=n; len++) {
			System.out.println("Length : " +len);
			for(int start=0; start<=n-len; start++) {
				for(int j=start; j<start+len; j++) {
					System.out.print(arr[j] +" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		SubArrays obj = new SubArrays();
		int arr1[] = {1,4,3,7,5,6};
		obj.subarrays(arr1);
	}
}
