package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Valid Parentheses
 * 
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {

    public boolean isValid(String s) {
    	if (s.length() % 2 != 0) {
			return false;
		}
    	Stack<Character> stack = new Stack<Character>();
    	
    	Map<Character, Character> map = new HashMap<Character, Character>();
    	map.put('(', ')');
    	map.put('{', '}');
    	map.put('[', ']');
    	map.put(')', '(');
    	map.put('}', '{');
    	map.put(']', '[');
    	
    	char[] array = s.toCharArray();
    	for (int i = 0; i < array.length; i++) {
    		if (stack.isEmpty() == true) {
				stack.push(array[i]);
				continue;
			}
    		if (map.get(stack.peek()) == array[i]) {
				stack.pop();
			} else {
				stack.push(array[i]);
			}
    	}
    	return stack.isEmpty() == true;   
    }
    
    public static void main(String[] args) {
		ValidParentheses valid = new ValidParentheses();
		String s = "]{";
		System.out.println(valid.isValid(s));
    }
}
