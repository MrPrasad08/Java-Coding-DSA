package arrays;

import java.util.Set;
import java.util.HashSet;

public class Duplicates {
	public int duplicatesNums(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[j] == arr[i]) {
					System.out.print(arr[j]+" ");
					break;
				}
			}
		}
		return 0;
	}
	public static void main(String args[]) {
		Duplicates obj = new Duplicates();
		int arr1[] = {0,2,1,4,2,5,1,5,5};
		obj.duplicatesNums(arr1);
	}
}
