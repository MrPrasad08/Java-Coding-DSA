package arrays;

public class IntersectionArray {
	public int intersection(int arr1[], int arr2[]) {
		for(int i=0; i<arr1.length; i++) {
			boolean found = false;
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					found = true;
					break;
				}
			}
			if(found) {
				System.out.print(arr1[i]+" ");
			}
		}
		return 1;
	}
	public static void main(String args[]) {
		IntersectionArray obj = new IntersectionArray();
		int a[] = {1,5,2,7,4,9};
		int b[] = {2,5,0,9,1};
		obj.intersection(a,b);
	}
}

