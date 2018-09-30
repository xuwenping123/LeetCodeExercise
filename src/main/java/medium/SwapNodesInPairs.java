package medium;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * Example:
 *
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Note:
 *
 * Your algorithm should use only constant extra space.
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 */
public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = new ListNode(-1);
        node.next = head;
        head = head.next;
        ListNode tmp1;
        ListNode tmp2;
        while (node.next != null && node.next.next != null) {
            tmp1 = node.next;
            tmp2 = tmp1.next.next;
            node.next = tmp1.next;
            node.next.next = tmp1;
            tmp1.next = tmp2;
            node = node.next.next;
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            this.val = x;
        }
    }
}
