package strings;

public class StringPalindrome {
	public void palindrome(String str) {
		String original = str;
		String rev = "";
		for(int i=str.length()-1 ; i>=0; i--) {
			rev += str.charAt(i);
		}
		if(rev.equals(original)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
	public static void main(String ars[]) {
		StringPalindrome obj = new StringPalindrome();
		String s = "MADAM";
		obj.palindrome(s);
	}
}