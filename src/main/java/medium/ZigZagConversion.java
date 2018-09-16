package medium;

/**
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 * Example 1:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 *
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 *
 */
public class ZigZagConversion {

    /**
     * 寻找规律
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || s.length() == 1 || s.length() == 2 || numRows == 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        char[] newChars = new char[chars.length];
        int pos = 0;
        int index;
        int temp;
        boolean flag;
        for (int i = 0; i < numRows; i++) {
            index = i;
            temp = i;
            flag = true;
            while (index < chars.length) {
                newChars[pos++] = chars[index];
                if (i == 0 || i == numRows - 1) {
                    index = index + 2 * (numRows - 1);
                } else {
                    flag = !flag;
                    if (flag) {
                        index = temp;
                    } else {
                        temp = temp + 2 * (numRows - 1);
                        index = temp - i - i;
                    }
                }
            }
        }
        return new String(newChars);
    }
}
