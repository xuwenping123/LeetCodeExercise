package easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 *
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
    	if (strs == null || strs.length == 0) {
			return "";
		}
    	char[] array = strs[0].toCharArray();
    	char[] arrayTemp;
    	int index = array.length - 1;
    	int temp;
    	for (int i = 1; i < strs.length; i++) {
    		temp = 0;
    		arrayTemp = strs[i].toCharArray();
    		while (temp <= index && temp <= arrayTemp.length - 1 && array[temp] == arrayTemp[temp]) {
    			temp++;
    		}
    		index = temp - 1;
    	}
    	return new String(array, 0, index + 1);
    }


	public String longestCommonPrefix2(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}
		int pos = 0;
		char ch;
		while(true) {
			for (int i = 0; i < strs.length; i++) {
				if (pos == strs[i].length()) {
					return strs[0].substring(0, pos);
				}
				ch = strs[0].charAt(pos);
				if (strs[i].charAt(pos) != ch) {
					return strs[0].substring(0, pos);
				}
			}
			pos++;
		}
	}

}
