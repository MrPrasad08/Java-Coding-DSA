package Sortings;

public class BubbleSort {
	void bubble (int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] >= arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]) {
		BubbleSort obj = new BubbleSort();
		int arr1[] = {5,3,9,2,7,8,4};
		obj.bubble(arr1);
	}
}
