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
	 * 
	 */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode first = l1;
        while (l1 != null) {
        	l1 = l1.next;
        }
        l1 = l2;
        // buff sort
        
        return null;
    }
    
    public static void main(String[] args) {
		
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
