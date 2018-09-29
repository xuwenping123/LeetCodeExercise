package medium;

import org.junit.Before;
import org.junit.Test;
import medium.RemoveEndNodeFromList.ListNode;

public class RemoveEndNodeFromListTest {

    private RemoveEndNodeFromList run;

    @Before
    public void setUp() {
        run = new RemoveEndNodeFromList();
    }

    @Test
    public void testRemoveNthFromEnd() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head = run.removeNthFromEnd(head, 2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    @Test
    public void testRemoveOneNthFromEnd() {
        ListNode head = new ListNode(1);
        head = run.removeNthFromEnd(head, 1);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}