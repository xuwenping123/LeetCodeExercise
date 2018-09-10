package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Palindrome Number
 * 
 * Determine whether an integer is a palindrome. Do this without extra space.
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
     * right
     * 
     * half Reverse
     */
    public boolean IsPalindrome2(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;
    }
    
    public static void main(String[] args) {
		
	}
}
