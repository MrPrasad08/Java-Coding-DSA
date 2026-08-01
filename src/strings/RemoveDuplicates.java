package strings;

public class RemoveDuplicates {
	public static void main(String args[]) {
		String str = "programming";
		String rev="";
		boolean visited[] = new boolean[256];
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(!visited[ch]) {
				rev += ch;
				visited[ch] = true;
			}
		}
		System.out.println(rev);
	}
}
