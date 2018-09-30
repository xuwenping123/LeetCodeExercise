package hard;

/**
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 *
 * k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 *
 * Example:
 *
 * Given this linked list: 1->2->3->4->5
 *
 * For k = 2, you should return: 2->1->4->3->5
 *
 * For k = 3, you should return: 3->2->1->4->5
 *
 * Note:
 *
 * Only constant extra memory is allowed.
 * You may not alter the values in the list's nodes, only nodes itself may be changed.
 */
public class ReverseNodesKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = new ListNode(-1);
        node.next = head;
        int n = k;
        // mod head
        while (--n > 0) {
            head = head.next;
        }

        while (true) {
            ListNode tmp = node;
            n = k + 1;
            // insure can loop k node != null
            while (n-- > 0 && tmp != null) {
                tmp = tmp.next;
            }
            if (n < 0) {
                int count = 1;
                // reverse in loop
                while (count <= k / 2) {
                    ListNode tmp1 = node.next;
                    ListNode tmp2 = node.next;
                    // sure tmp2
                    int value = k - (count - 1) * 2 - 1;
                    while ( value-- > 0) {
                        tmp2 = tmp2.next;
                    }
                    /*node.next = tmp2;
                    tmp1.next = tmp2.next;
                    tmp2.next = tmp1;*/
                    

                    node = node.next;
                    count++;
                }
                if (k / 2 != 0) {

                }
                // node run to next k;
                count = k / 2;
                while (count -- > 0) {
                    node = node.next;
                }
            } else {
                break;
            }
        }
        return head;
    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            this.val = x;
        }
    }
}
