package numbers;

public class ArmStrong {
	public static void main(String args[]) {
		int num = 1532;
		int temp = num;
		int sum = 0;
		while(num!=0) {
			int digit = num%10;
			sum += digit*digit*digit;
			num = num/10;
		}
		if(sum == temp) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("not");
		}
	}
}
