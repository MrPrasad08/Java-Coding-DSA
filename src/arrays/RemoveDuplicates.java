package arrays;

public class RemoveDuplicates {
	public void remove(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			boolean isPrint = true;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					isPrint = false;
					break;
				}
			}
			if(isPrint) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String args[]) {
		RemoveDuplicates obj = new RemoveDuplicates();
		int a[] = {0,3,2,8,1,7,1,0,8,5,3};
		obj.remove(a);
	}
}