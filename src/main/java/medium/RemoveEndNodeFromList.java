package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a linked list, remove the n-th node from the end of list and return its head.
 *
 * Example:
 *
 * Given linked list: 1->2->3->4->5, and n = 2.
 *
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 *
 * Given n will always be valid.
 */
public class RemoveEndNodeFromList {

    /**
     * 首先遍历链表，获取链表结点数，剔除结点
     * 再重新遍历链表进行复制
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        List<Integer> list = new ArrayList<Integer>();
        ListNode node = head;
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        list.remove(list.size() - n);
        node = head.next;
        for (int i = 0; i < list.size(); i++) {
            node.val = list.get(i);
            node = node.next;
        }
        return head.next;
    }

     static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
}
