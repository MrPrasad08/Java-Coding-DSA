package arrays;

public class RomanToInteger {
	static int value(char r) {
		if (r=='I')
			return 1;
		if (r=='V')
			return 5;
		if (r=='X')
			return 10;
		if (r=='L')
			return 50;
		if (r=='C')
			return 100;
		if (r=='D')
			return 500;
		if (r=='M')
			return 1000;
		return -1;
	}
	
	static int roman(String s) {
		s = s.toUpperCase();
		int sum = 0;
		int n = s.length();
		for(int i=0; i<n-1; i++) {
			int current = value(s.charAt(i));
			int next = value(s.charAt(i+1));
			
			if(current >= next) {
				sum += current;
			}
			else {
				sum -= current;
			}
		}
		sum += value(s.charAt(n-1));
		System.out.print(sum);
		return sum;
	}
	public static void main(String args[]) {
		roman("LVIII");
	}
}
