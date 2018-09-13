package medium;

/**
 *
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Example 1:
 *
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: "cbbd"
 * Output: "bb"
 *
 */
public class LongestPalSubString {

    public String longestPalindrome(String s) {
        if (s == null) {
            return null;
        }
        if (s.length() == 0 || s.length() == 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int first;
        int next = 0;
        int tempFirst;
        int tempNext;
        boolean flag = true;
        int recordFirst = 0;
        int recordNext = 0;
        while (next < chars.length) {
            first = next + 1;
            while (first < chars.length) {
                tempFirst = first;
                tempNext = next;
                while (tempNext < tempFirst) {
                    if (chars[tempNext++] != chars[tempFirst--]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    if ((recordFirst - recordNext) < (first - next)) {
                        recordFirst = first;
                        recordNext = next;
                    }
                }
                flag = true;
                first++;
            }
            next++;
        }
        String value = s.substring(recordNext, recordFirst + 1);
        return  value;
    }
}
