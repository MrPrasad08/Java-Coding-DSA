package strings;

public class StringRev {
	public void reverse(String s) {
		int n = s.length();
		for(int i=n-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
	}
	public static void main(String srgs[]) {
		StringRev obj  = new StringRev();
		String str = "Prasad";
		obj.reverse(str);
	}
}
