package arrays;

import java.util.Scanner;

public class LinearSearch {
	static void Search(int[] arr, int find) {
		boolean found = false;
		int index = 0;
		System.out.println("\nArray Elements are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == find) {
				found = true;
				index = j;
			}
		}
		if (found) {
			System.out.println("\n\nElement found at : " + index);
		} else {
			System.out.println("Not Found");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the search element : ");
		int found = sc.nextInt();
		Search(arr, found);
	}
}
