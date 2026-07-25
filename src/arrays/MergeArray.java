package arrays;

class MergeArray {
	public void mergeArr(int arr1[], int arr2[]) {
		int result[] = new int[arr1.length + arr2.length];
		int j=0;
		for(int i=0; i<arr1.length; i++) {
			System.out.print(j+" ");
			result[j] += arr1[i];
			j++;
		}
		System.out.print(j);
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			result[j] += arr2[i];
			j++;
		}
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
	void main() {
		MergeArray obj = new MergeArray();
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
		obj.mergeArr(a, b);
	}
}
