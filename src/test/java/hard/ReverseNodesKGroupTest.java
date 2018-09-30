package hard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseNodesKGroupTest {

    private ReverseNodesKGroup reverse;

    @Before
    public void setUp() throws Exception {
        reverse = new ReverseNodesKGroup();
    }

    @Test
    public void reverseKGroup() {
        ReverseNodesKGroup.ListNode head = new ReverseNodesKGroup.ListNode(1);
        head.next = new ReverseNodesKGroup.ListNode(2);
        head.next.next = new ReverseNodesKGroup.ListNode(3);
//        head.next.next.next = new ReverseNodesKGroup.ListNode(4);
//        head.next.next.next.next = new ReverseNodesKGroup.ListNode(5);
        head = reverse.reverseKGroup(head, 3);
        while (head != null) {
            System.out.print(head.val + "  ");
            head = head.next;
        }
        while (head != null) {
            System.out.print(head.val + "  ");
            head = head.next;
        }
    }
}