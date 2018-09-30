package hard;

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 *
 * Example:
 *
 * Input:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * Output: 1->1->2->3->4->4->5->6
 */
public class MergeSortedLists {

    /**
     * 使用递归
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        ListNode node = new ListNode(-1);
        ListNode head = node;
        node.next = lists[0];
        helper(node, lists, 1);
        return head.next;
    }

    private void helper(ListNode node, ListNode[] lists, int index) {
        if (index >= lists.length) {
            return;
        }
        ListNode head = node;
        ListNode tmp;
        while (node.next != null && lists[index] != null) {
            if (node.next.val <= lists[index].val) {
                node = node.next;
            } else {
                tmp = node.next;
                node.next = lists[index];
                node = node.next;
                lists[index] = lists[index].next;
                node.next = tmp;
            }
        }
        if (lists[index] != null) {
            node.next = lists[index];
        }
        helper(head, lists, index + 1);
    }

   public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            this.val = x;
        }
    }
}
