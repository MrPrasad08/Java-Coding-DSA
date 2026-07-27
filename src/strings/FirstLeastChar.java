package strings;

public class FirstLeastChar {
	public static void main(String args[]) {
		String s = "aabcdde";
		int feq[] = new int[256];
		for(int i=0; i<s.length(); i++) {
			feq[s.charAt(i)]++;
		}
		for(int i=0; i<s.length(); i++) {
			if(feq[s.charAt(i)] == 1) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}
}
