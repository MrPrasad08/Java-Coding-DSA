package strings;

public class CharFrequency {
	public void frequency(String str) {
		for(int i=0; i<str.length(); i++) {
			int count =1;
			boolean find = false;
			for(int k=0; k<i; k++) {
				if(str.charAt(i) == str.charAt(k)) {
					find = true;
					break;
				}
			}
			if(find)
				continue;
			for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
					break;
				}
			}
			System.out.println(str.charAt(i)+ " => " +count);
		}
	}
	public static void main(String args[]) {
		CharFrequency obj = new CharFrequency();
		String s = "hello";
		obj.frequency(s);
	}
}