package strings;

public class Vowels {
	public void vowelcount(String str) {
		str = str.toLowerCase();
		int vowels = 0;
		int cons =0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				vowels++;
			}
			else {
				cons++;
			}
		}
		System.out.println("Vowels = " +vowels);
		System.out.println("Consonants = " +cons);
	}
	public static void main(String args[]) {
		Vowels obj = new Vowels();
		String s = "aeiou";
		obj.vowelcount(s);
	}
}