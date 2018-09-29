package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < n; i++) {
            list.add('(');
        }
        for (int i = 0; i < n; i++) {
            list.add(')');
        }
        generate(result, 0, list, sb);
        return result;
    }

    private void generate(List<String> result, int index, List<Character> list, StringBuilder sb) {
        if (index >= list.size()) {
            String str = sb.toString();
            if (isParenthesis(str)) {
                result.add(str);
            }
            return;
        }
        for (int i = index; i < list.size(); i++) {
            sb.append(list.get(i));
            generate(result, index + 1, list, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    private boolean isParenthesis(String sb) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < sb.length(); i++) {
            if (stack.empty()) {
                stack.push(sb.charAt(i));
                continue;
            }
            if (stack.peek() == '(' && sb.charAt(i) ==')') {
                stack.pop();
            } else {
                stack.push(sb.charAt(i));
            }
        }
        return stack.empty();
    }
}
