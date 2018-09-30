package medium;

import org.junit.Before;
import org.junit.Test;

public class SwapNodesInPairsTest {

    private SwapNodesInPairs swap;

    @Before
    public void setUp() throws Exception {
        swap = new SwapNodesInPairs();
    }

    @Test
    public void testSwapPairs() {
        SwapNodesInPairs.ListNode head = new SwapNodesInPairs.ListNode(1);
        head.next = new SwapNodesInPairs.ListNode(2);
        head.next.next = new SwapNodesInPairs.ListNode(3);
        head.next.next.next = new SwapNodesInPairs.ListNode(4);
        head = swap.swapPairs(head);
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
    }
}