package easy;

import java.util.Stack;

/**
 * Reverse Integer
 * 
 * Reverse digits of an integer.
 * 
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 */
public class ReverseInteger {

	/**
	 * right
	 * 
	 */
	public int reverse(int x) {
        boolean flag = x >= 0;//��¼����������������true, else false
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
	
	public static void main(String[] args) {
		ReverseInteger reverse = new ReverseInteger();
		int x = -2147483648;
		System.out.println(reverse.reverse2(x));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
