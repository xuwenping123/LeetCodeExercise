package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *
 * Example 1:
 *
 * Input: 121
 * Output: true
 * Example 2:
 *
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Follow up:
 *
 * Coud you solve it without converting the integer to a string?
 *
 */
public class PalindromeNumber {

	/**
	 * right 
	 *
	 */
    public boolean isPalindrome(int x) {
		if (x == 0) {
			return true;
		}
		if (x < 0 || x % 10 == 0) {
			return false;
		}
		List<Integer> list = new ArrayList<Integer>();
		list.add(x % 10);
		while ( x / 10 > 0 ) {
			x = x / 10;
			list.add(x % 10);
		}
		int start = 0;
		int end = list.size() - 1;
		while (start <= end) {
			if (list.get(start) == list.get(end)) {
				start++;
				end--;
			} else {
				return false;
			}
		}
		return true;
	}

	/**
	 * 是否是回字文数字
	 * @param x
	 * @return
	 */
	public boolean IsPalindrome2(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;	//revertedNumber 为 x 反转后的数字
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
		/**
		 * if x.length / 2 == 0 , x == revertedNumber
		 * else x.length / 2 != 0, x == revertedNumber/10;
		 */
		return x == revertedNumber || x == revertedNumber/10;
    }
}
