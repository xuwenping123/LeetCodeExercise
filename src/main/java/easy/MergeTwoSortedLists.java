package easy;

/**
 * Merge Two Sorted Lists
 * 
 * Merge two sorted linked lists and return it as a new list. 
 * 
 * The new list should be made by splicing together the nodes of the first two lists.
 * 
 */
public class MergeTwoSortedLists {

	/**
	 * 借助归并排序算法数组合并思想进行处理
	 * @param l1
	 * @param l2
	 * @return
	 */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode node = new ListNode(-1);
		ListNode head = node;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				node.next = l1;
				l1 = l1.next;
			} else {
				node.next = l2;
				l2 = l2.next;
			}
			node = node.next;
		}
		if (l1 != null) {
			while (l1 != null) {
				node.next = l1;
				node = node.next;
				l1 = l1.next;
			}
		} else if (l2 != null) {
			while (l2 != null) {
				node.next = l2;
				node = node.next;
				l2 = l2.next;
			}
		}
        return head.next;
    }


	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
}

