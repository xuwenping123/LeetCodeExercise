package easy;

import medium.AddTwoNumbers;

public class AddStrings {

    /**
     * 将字符串转成字符数组，问题转变为计算两个字符数组的和
     * 与 @see AddTwoNumbers 不同的是，计算结果将从后往前计算，并添加上次计算的进位数
     * @see AddTwoNumbers
     * @param num1
     * @param num2
     * @return
     */
    public String addStrings(String num1, String num2) {
        if (num1 == null || num1.length() == 0) {
            return num2;
        }
        if (num2 == null || num2.length() == 0) {
            return num1;
        }
        char[] p = num1.toCharArray();
        char[] q = num2.toCharArray();
        // 两个数相加，新生成的元素的数组的长度最多+1，即可保证可容纳
        char[] result = new char[p.length > q.length ? p.length + 1 : q.length + 1];
        int pIndex = p.length - 1, qIndex = q.length - 1;
        int index = result.length;
        int carry = 0;
        int sum;
        // 元素计算时从最后一位计算
        // 进入结果数组时也从最后一位入组
        while (pIndex >= 0 || qIndex >= 0) {
            int x = (pIndex < 0) ? 0 : (p[pIndex] - '0');
            int y = (qIndex < 0) ? 0 : (q[qIndex] - '0');
            sum = x + y + carry;
            carry = sum / 10;
            result[--index] = (char)(sum % 10 + '0');
            pIndex--;
            qIndex--;
        }
        if (carry > 0) {
            result[--index] = (char)(carry + '0');
        }
        return new String(result, index, result.length - index);
    }
}
