package Sortings;

public class SelectionSort {
	void selection(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			int min =i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
	}
	public static void main(String args[]) {
		SelectionSort obj = new SelectionSort();
		int arr1[] = {6,2,8,4,9,1,3,10};
		obj.selection(arr1);
	}
}