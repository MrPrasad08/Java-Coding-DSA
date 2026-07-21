package strings;
import java.util.Stack;
 
public class CommonPrefix {
	public boolean valid(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				stack.push(ch);
			}
			else {
			   if(stack.empty()) {
				return false;
			   }
				  char top = stack.peek();
				if((ch==')' && top=='(') ||
				   (ch=='}' && top=='{') ||
				   (ch==']' && top=='[')) {
					stack.pop();
				}
				else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	} 
	public static void main(String args[]) {
		CommonPrefix obj = new CommonPrefix();
		boolean a = obj.valid("([])");
		System.out.println(a);
	}
}