package numbers;

public class PrimeNums {
	public static void main(String args[]) {
		int num =17;
		int count =0;
		if(num<1) {
			System.out.println("Not Prime");
			return;
		}
		if(num==1||num == 2 || num ==3) {
			System.out.println("Prime Number");
			return;
		}
		for(int i=5; i*i<num; i++) {
			if (num%i == 0) {
				count++;
				break;
			}
		}
		if(count == 1) { 
			System.out.println("Not a Prime");
		}
		else {
			System.out.println("Prime");
		}
	}
}
