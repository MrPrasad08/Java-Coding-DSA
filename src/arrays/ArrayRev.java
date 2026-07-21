package arrays;

public class ArrayRev {
	public int[] reverse(int arr[]) {
		int n = arr.length;
		for(int i=n-1; i>=0; i--) {
			System.out.print(arr[i] +" ");
		}
		return arr;
	}
	public static void main(String args[]) {
		ArrayRev obj = new ArrayRev();
		int arr1[] = {10,20,30,40,50,60};
		obj.reverse(arr1);
	} 
}
