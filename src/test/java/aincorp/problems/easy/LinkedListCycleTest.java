package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    private final LinkedListCycle listCycle = new LinkedListCycle();

    @Test
    public void when_ListNode_have_cycle() {
        ListNode two = new ListNode(2);
        two.next = new ListNode(0, new ListNode(-4, two));
        ListNode head = new ListNode(3, two);

        assertTrue(listCycle.hasCycle(head));
    }

    @Test
    public void when_ListNode_Not_have_cycle(){
        assertFalse(listCycle.hasCycle(new ListNode(1)));
    }

    @Test
    public void when_ListNode_have_cycle_second_test() {
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2, head);
        head.next = two;

        assertTrue(listCycle.hasCycle(head));
    }

}