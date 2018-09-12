package medium;

import java.util.ArrayList;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstring {

    /**
     * 使用数组作为中间存储介质
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        char[] chars = s.toCharArray();
        int pos;
        int subCount = 0;
        ArrayList<Character> list = new ArrayList<Character>(chars.length);
        for (int i = 0; i < chars.length; i++) {
            pos = list.indexOf(chars[i]);
            if (pos >= 0) {
                subCount = subCount < list.size() ? list.size() : subCount;
                while (pos != -1) {
                    list.remove(pos--);
                }
                list.add(chars[i]);
            } else {
                list.add(chars[i]);
            }
        }
        subCount = subCount < list.size() ? list.size() : subCount;
        return subCount;
    }

    /**
     * 使用一前一后两枚指针进行数组遍历
     * @param s
     * @return
     */
    public int lengthOfLongestSubstringPos(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int fast = 0;
        int low = 0;
        int subCount = 0;
        char[] chars = s.toCharArray();
        int temp;
        boolean flag = false;
        while(fast < chars.length) {
            if (fast > 0) {
                for (temp = low; temp < fast; temp++) {
                    if (chars[temp] == chars[fast]) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    subCount = subCount < fast - low ? fast - low : subCount;
                    low = temp + 1;
                    fast++;
                } else {
                    fast++;
                }
            } else {
                fast++;
            }
            flag = false;
        }
        subCount = subCount < fast - low ? fast - low : subCount;
        return subCount;
    }
}