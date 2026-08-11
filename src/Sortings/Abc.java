package Sortings;

public class Abc {
	public static void main(String args[]) {
		int arr[] = {2,1,5,1,3,2,5,2,1,4,6,4};
		
		for(int i=0; i<arr.length; i++) {
			boolean found = false;
			for(int k=0; k<i; k++) {
				if(arr[k] == arr[i]) {
					found = true;
					break;
				}
			}
			if(!found) {
				System.out.print(arr[i] +" ");
			}
		}
	}
}