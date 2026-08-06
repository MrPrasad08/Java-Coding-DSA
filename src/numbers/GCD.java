package numbers;

public class GCD {
	public static void main(String args[]) {
		int a = 12;
		int b= 18;
		int gcd = b%a;
		int lcm = (a*b)/gcd;
		System.out.println(lcm);
	}
}
