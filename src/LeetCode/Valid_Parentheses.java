/* Name :- Kushal S Shinde
 * Email:- kshinde1@binghamton.edu
 * 
 * 
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

 */

package LeetCode;

import java.util.Scanner;
import java.util.Stack;

public class Valid_Parentheses {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		
		System.out.println(isValid(input) ? "Valid" : "Invalid");
		in.close();
	}
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		for(char c : s.toCharArray()) {
			if(c == '(' || c == '{' || c =='[')
				stack.push(c);
			else if(c==')') {
				if(!stack.isEmpty() && stack.peek()=='(')
					stack.pop();
				else
					return false;
			}
			else if(c=='}') {
				if(!stack.isEmpty() && stack.peek()=='{')
					stack.pop();
				else
					return false;
			}
			else if(c==']') {
				if(!stack.isEmpty() && stack.peek()=='[')
					stack.pop();
				else
					return false;
			}
		}
        return stack.isEmpty();
    }

}
