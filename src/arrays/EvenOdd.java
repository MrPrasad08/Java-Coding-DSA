package arrays;
import java.util.Scanner;
public class EvenOdd {
	public void evenOdd(){
		Scanner sc = new Scanner(System.in);
		int even =0;
		int odd =0;
		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements into the array :");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements is : ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0; i<n; i++) {
			if (arr[i]%2 == 0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println();
		System.out.println("Even's : " +even);
		System.out.println("Odd's : " +odd);
		sc.close();
	}
	public static void main(String args[]) {
		EvenOdd obj = new EvenOdd();
		obj.evenOdd();
	}
}
