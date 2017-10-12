package easy;

/**
 * Longest Common Prefix
 * Write a function to find the longest common prefix string amongst an array of strings.
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
    
    public static void main(String[] args) {
		LongestCommonPrefix prefix = new LongestCommonPrefix();
		String[] strs = { "1234", "12345", "123", "12", "2"};
		System.out.println(prefix.longestCommonPrefix(strs));
	}
}
