package strings;

public class LongestWord {
	public void longest(String str) {
		String arr[] = str.split(" ");
		String large = arr[0];
		for(int i=0; i<arr.length; i++) {
//		System.out.print(arr[i]+" ");
		if(arr[i].length() >= large.length()) {
			large = arr[i];
		}
		}
		System.out.println(large);
	}
	public static void main(String args[]) {
		LongestWord obj = new LongestWord();
		String s = "java is a programming language";
		obj.longest(s);
	}
}
