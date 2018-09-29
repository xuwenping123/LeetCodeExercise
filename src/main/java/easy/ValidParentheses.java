package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 *
 * Input: "()"
 * Output: true
 * Example 2:
 *
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: "(]"
 * Output: false
 * Example 4:
 *
 * Input: "([)]"
 * Output: false
 * Example 5:
 *
 * Input: "{[]}"
 * Output: true
 */
public class ValidParentheses {

	/**
	 * 使用Stack
	 * @param s
	 * @return
	 */
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
}
