package medium;

/**

 You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Example:

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 Explanation: 342 + 465 = 807.

 */
public class AddTwoNumbers {

    static class ListNode {

        int val;

        ListNode next;

        ListNode(int x) { val = x; }

    }

    /**
     * 使用到了归并排序关于两个数组合并成一个数组的思想
     * @param l1
     * @param l2
     * @return
     */
    public ListNode solve(ListNode l1, ListNode l2) {
        ListNode node = l1;
        ListNode temp = l1;
        int value1, value2;
        boolean flag = false;
        while(l1 != null && l2 != null) {
            value1 = l1.val;
            value2 = l2.val;
            if (flag) {
                if (value1 + value2 + 1 >=10) {
                    l1.val = (value1 + value2 + 1) - 10;
                    flag = true;
                } else {
                    l1.val = value1 + value2 + 1;
                    flag = false;
                }
            } else {
                if (value1 + value2 >= 10) {
                    l1.val = (value1 + value2) - 10;
                    flag = true;
                } else {
                    l1.val = value1 + value2;
                    flag = false;
                }
            }
            temp = l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            while(l1 != null) {
                if (flag) {
                    if (l1.val + 1 >= 10) {
                        l1.val = 0;
                        flag = true;
                    } else {
                        l1.val = l1.val + 1;
                        flag = false;
                    }
                }
                temp = l1;
                l1 = l1.next;
            }
        }
        if (l2 != null) {
            temp.next = l2;
            while(l2 != null) {
                if (flag) {
                    if (l2.val + 1 >= 10) {
                        l2.val = 0;
                        flag = true;
                    } else {
                        l2.val = l2.val + 1;
                        flag = false;
                    }
                }
                temp = l2;
                l2 = l2.next;
            }
        }
        if (l1 == null && l2 == null) {
            if (flag) {
                temp.next = new ListNode(1);
            }
        }
        return node;
    }

    /**
     * 与上面的方法类似，不过简化了大量代码与循环
     * @param l1
     * @param l2
     * @return
     */
    public ListNode solve2(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(0);
        int sum;
        ListNode p = l1, q = l2, curr = preHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return preHead.next;
    }
}
