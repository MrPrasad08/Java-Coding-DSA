package arrays;

public class MissingNums {
	public void missings(int arr[], int size) {
		for(int i=1; i<=size; i++) {
			boolean isPrint = true;
			for(int j=0; j<arr.length; j++) {
				if(arr[j] == i) {
					isPrint = false;
					break;
				}
			}
			if(isPrint) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String args[]) {
		MissingNums obj = new MissingNums();
		int a[] = {2,4,7,10};
		obj.missings(a,10);
	}
}
