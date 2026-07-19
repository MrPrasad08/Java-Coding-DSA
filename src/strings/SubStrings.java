package strings;

public class SubStrings {
	public void substrings(String str) {
		int n=str.length();
		for(int len=1; len<=n; len++) {
			System.out.println("Length is : "+len);
			for(int start=0; start<=n-len; start++) {
				for(int ch=start; ch<start+len; ch++) {
					System.out.print(str.charAt(ch)+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		SubStrings obj = new SubStrings();
		obj.substrings("Prasad");
	}
}
