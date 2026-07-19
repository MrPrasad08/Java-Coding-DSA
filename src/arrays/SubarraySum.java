package arrays;

public class SubarraySum {
	public void sum(int arr[]) {
		int n=arr.length;
		int max = 0;
		for(int len=1; len<=n; len++) {
			System.out.println("Length is : " +len);
			for(int start=0; start<=n-len; start++) {
				int sum =0;
				for(int j=start; j<start+len; j++) {
					System.out.print(arr[j]+" ");
					sum += arr[j];
				}
				System.out.print(" ==> Sum is : " +sum);
				System.out.println();
				if(sum >= max) {
					max = sum;
				}
			}
			System.out.println("Maximum Sum is : "+max);
			System.out.println();
		}
	}
	public static void main(String args[]) {
		SubarraySum obj = new SubarraySum();
		int arr1[] = {1,4,3,7,5,6};
		obj.sum(arr1);
	}
}
