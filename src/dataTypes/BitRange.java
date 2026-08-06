package dataTypes;
import java.util.Scanner;

public class BitRange {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length : ");
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			
			try {
				System.out.println("Enter number : ");
				long n = sc.nextLong();
			System.out.println(n+" can be fitted in : ");
			if(n>=Byte.MIN_VALUE && n<=Byte.MAX_VALUE) {
		            System.out.println("* byte");
			}
			if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE) {
		            System.out.println("* int");
			}
			if(n>=Long.MIN_VALUE && n<=Long.MAX_VALUE) {
		            System.out.println("* long");
			}
			}
			catch(Exception e) {
				System.out.println(sc.next()+" can't be fitted in : ");
			}
		}
		sc.close();
	}
}
