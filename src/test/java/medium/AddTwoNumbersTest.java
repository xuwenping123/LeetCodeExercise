package medium;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    private String readNodeValue(AddTwoNumbers.ListNode node) {
        String str = "";
        while(node != null) {
            str = str + node.val;
            node = node.next;
        }
        return str;
    }

    @Test
    public void testOneNumbers() {
        AddTwoNumbers.ListNode node1 = new AddTwoNumbers.ListNode(1);
        AddTwoNumbers.ListNode node2 = new AddTwoNumbers.ListNode(1);
        AddTwoNumbers.ListNode node = addTwoNumbers.solve(node1, node2);
        Assert.assertEquals("2", readNodeValue(node));
    }

    @Test
    public void testOne2Numbers() {
        AddTwoNumbers.ListNode node1 = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode node2 = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode node = addTwoNumbers.solve(node1, node2);
        Assert.assertEquals("01", readNodeValue(node));
    }

    @Test
    public void testTwoNumbers() {
        AddTwoNumbers.ListNode node1 = new AddTwoNumbers.ListNode(1);
        AddTwoNumbers.ListNode node2 = new AddTwoNumbers.ListNode(1);
        AddTwoNumbers.ListNode node3 = new AddTwoNumbers.ListNode(2);
        node2.next = node3;
        AddTwoNumbers.ListNode node = addTwoNumbers.solve(node1, node2);
        Assert.assertEquals("22", readNodeValue(node));
    }

    @Test
    public void testOverNumbers() {
        AddTwoNumbers.ListNode node1 = new AddTwoNumbers.ListNode(1);
        AddTwoNumbers.ListNode node2 = new AddTwoNumbers.ListNode(9);
        AddTwoNumbers.ListNode node3 = new AddTwoNumbers.ListNode(2);
        node2.next = node3;
        AddTwoNumbers.ListNode node = addTwoNumbers.solve(node1, node2);
        Assert.assertEquals("03", readNodeValue(node));
    }

    @Test
    public void testOverTwoNumbers() {
        AddTwoNumbers.ListNode node1 = new AddTwoNumbers.ListNode(1);
        AddTwoNumbers.ListNode node2 = new AddTwoNumbers.ListNode(2);
        AddTwoNumbers.ListNode node3 = new AddTwoNumbers.ListNode(3);
        AddTwoNumbers.ListNode node4 = new AddTwoNumbers.ListNode(7);
        node1.next = node3;
        node2.next = node4;
        AddTwoNumbers.ListNode node = addTwoNumbers.solve(node1, node2);
        Assert.assertEquals("301", readNodeValue(node));
    }
}
