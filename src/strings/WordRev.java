package strings;

public class WordRev {
	public void word(String str) {
		String arr[] = str.split(" ");
		for(int i=0; i<arr.length; i++) {
			if(i%2 ==0) {
				String s = arr[i];
				for(int j=s.length()-1; j>=0; j--) {
					System.out.print(s.charAt(j));
				}
				System.out.print(" ");
			}
			else {
				System.out.print(arr[i].toUpperCase()+" ");
			}
		}
	}
	public static void main(String args[]) {
		WordRev obj = new WordRev();
		String s = "Heyy Dalring I am Durga Prasad";
		obj.word(s);
	}
}