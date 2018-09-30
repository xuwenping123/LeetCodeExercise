package hard;

import org.junit.Before;
import org.junit.Test;

public class MergeSortedListsTest {

    private MergeSortedLists merge;

    @Before
    public void setUp() {
        merge = new MergeSortedLists();
    }

    @Test
    public void mergeKLists() {
        MergeSortedLists.ListNode[] lists = new MergeSortedLists.ListNode[3];
        MergeSortedLists.ListNode first = new MergeSortedLists.ListNode(1);
        first.next = new MergeSortedLists.ListNode(4);
        first.next.next = new MergeSortedLists.ListNode(5);
        MergeSortedLists.ListNode second = new MergeSortedLists.ListNode(1);
        second.next = new MergeSortedLists.ListNode(3);
        second.next.next = new MergeSortedLists.ListNode(4);
        MergeSortedLists.ListNode third = new MergeSortedLists.ListNode(2);
        third.next = new MergeSortedLists.ListNode(6);
        lists[0] = first;
        lists[1] = second;
        lists[2] = third;
        MergeSortedLists.ListNode head = merge.mergeKLists(lists);
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
    }
}