package strings;

public class Anagram {
	public void anagram(String str, String str1) {
		if(str.length() != str1.length()) {
			System.out.println("Not an Anagram");
			return;
		}
		int feq[] = new int[256];
		boolean found = true;
		for(int i=0; i<str.length(); i++) {
			feq[str.charAt(i)]++;
			feq[str1.charAt(i)]--;
		}
		for(int i=0; i<256; i++) {
			if(feq[i] != 0) {
				found = false;
				break;
			}
		}
		if(found) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not");
		}
	}
	public static void main(String args[]) {
		Anagram obj = new Anagram();
		String s1 = "silent";
		String s2 = "liasen";
		obj.anagram(s1, s2);
	}
}
