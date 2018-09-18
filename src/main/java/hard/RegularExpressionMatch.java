package hard;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.
 *
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 *
 * Note:
 *
 * s could be empty and contains only lowercase letters a-z.
 * p could be empty and contains only lowercase letters a-z, and characters like . or *.
 * Example 1:
 *
 * Input:
 * s = "aa"
 * p = "a"
 * Output: false
 * Explanation: "a" does not match the entire string "aa".
 * Example 2:
 *
 * Input:
 * s = "aa"
 * p = "a*"
 * Output: true
 * Explanation: '*' means zero or more of the precedeng element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
 * Example 3:
 *
 * Input:
 * s = "ab"
 * p = ".*"
 * Output: true
 * Explanation: ".*" means "zero or more (*) of any character (.)".
 * Example 4:
 *
 * Input:
 * s = "aab"
 * p = "c*a*b"
 * Output: true
 * Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore it matches "aab".
 * Example 5:
 *
 * Input:
 * s = "mississippi"
 * p = "mis*is*p*."
 * Output: false
 *
 */
public class RegularExpressionMatch {

    /**
     * can not solve
     * <href>https://hk029.gitbooks.io/leetbook/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92/010.%20Regular%20Expression%20Matching/010.%20Regular%20Expression%20Matching.html</href>
     * @param s
     * @param p
     * @return
     */
    public boolean isMatch(String s, String p) {

        return loopMatch(s, s.length() - 1, p, p.length() - 1);
    }


    public boolean loopMatch(String s, int i, String p, int j) {
        if (j < 0) {
            if (i < 0) {
                return true;
            }
            return false;
        }
        if (p.charAt(j) == '*') {
            // 比较 s[i] 与 p[j - 1]   判断 * 是否代替前一个元素
            // if true 比较 s[i] 与 p[j - 2]   * 已经代替了一次，判断总共会代替几次
            // if false * 没有代替，前一个元素出现 0 次
            if (i >= 0 && (s.charAt(i) == p.charAt(j - 1) || p.charAt(j - 1) == '.')) {
                if (loopMatch(s, i - 1, p, j)) {
                    return true;
                }
            }
            return loopMatch(s, i, p, j - 2);
        }
        if (i < 0) {
            return false;
        }
        if (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i)) {
            return loopMatch(s, i - 1, p, j - 1);
        }
        return false;
    }
}
