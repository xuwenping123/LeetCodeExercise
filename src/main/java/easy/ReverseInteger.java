package easy;

import java.util.Stack;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 *
 */
public class ReverseInteger {

	/**
	 * right
	 * 
	 */
	public int reverse(int x) {
        boolean flag = x >= 0;
        StringBuilder sb = new StringBuilder();
        String str = x + "";
        char[] chars = str.toCharArray();
        for(int i = chars.length - 1; i >= 0 ; i--) {
            sb.append(chars[i]);
            if(i == 1 && flag == false) {
                break;
            }
        }
        int reverseInt;
        try {
        	reverseInt = Integer.valueOf(sb.toString());
        } catch(NumberFormatException e) {
        	return 0;
        }
        if (flag == false) {
        	reverseInt = reverseInt * (-1);
        }
/*        if(flag == true && reverseInt < 0) {
           return 0; 
        }
        if(flag == false && reverseInt > 0) {
            return 0;
        }*/
        return reverseInt;
    }
	
	/**
	 * rigth
	 * 
	 * use stack
	 * 
	 *
	 */
	public int reverse2(int x) {
		int flag = x > 0 ? 1 : -1;
		x = Math.abs(x);
		if (x <= 0) {
			return 0;
		}
		Stack<Integer> stack = new Stack<Integer>();
		int digit;
		int i = 10;
		long value = 0l;
		do {
			digit = x % i;
			stack.push(digit);
			x /= 10;
		} while (x > 0);
		long j = 1;
		while (!stack.isEmpty()) {
			value += stack.pop() * j;
			j *= 10;
		}
		if (value > Integer.MAX_VALUE) {
			return 0;
		}
		return (int)value * flag;
	}

	/**
	 * O(1)
	 * add 18-09-16
	 * @param x
	 * @return
	 */
	public int reverse3(int x) {
		// if x >= 0 , flag = true ; else flag = false;
		boolean flag = x >= 0;
		if (!flag) {
			x *= (-1);
		}
		int value = 0;
		int remainder;
		int n = 0;
		int temp = x;
		while (temp > 0) {
			temp = temp / 10;
			n++;
		}
		while (x > 0) {
			remainder = x % 10;
			if (flag) {
				value = value + remainder * (int) Math.pow(10, --n);
			} else {
				value = value - remainder * (int) Math.pow(10, --n);
			}
			x = x / 10;
		}
		return value;
	}

}
