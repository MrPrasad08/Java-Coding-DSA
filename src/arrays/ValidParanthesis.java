package arrays;
import java.util.Stack;


public class ValidParanthesis {
	public static void main(String[] args) {
		Stack<Character> s = new Stack<>();
		String str = "(){}[]";
		for(int i=0; i<str.length();i++) {
			s.push(str.charAt(i));
		}
		
		for(char ch : s) {
			System.out.println(ch);
		}
	}
}