package medium;

import java.util.*;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 *
 *
 *
 * Example:
 *
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 *
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 */
public class LetterCombinPhoneNum {

    /**
     * 使用递归
     * @param digits
     * @return
     */
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        Map<Character, char[]> map = new HashMap<Character, char[]>();
        map.put('2', new char[]{'a','b','c'});
        map.put('3', new char[]{'d','e','f'});
        map.put('4', new char[]{'g','h','i'});
        map.put('5', new char[]{'j','k','l'});
        map.put('6', new char[]{'m','n','o'});
        map.put('7', new char[]{'p','q','r','s'});
        map.put('8', new char[]{'t','u','v'});
        map.put('9', new char[]{'w','x','y','z'});
        helper(digits, 0, new StringBuilder(), map, result);
        return result;
    }

    private void helper(String digits, int index, StringBuilder sb, Map<Character, char[]>map, List<String> result) {
        if (index >= digits.length()) {
            result.add(sb.toString());
            return;
        }
        char[] chars = map.get(digits.charAt(index));
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
            helper(digits, index + 1, sb, map, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
