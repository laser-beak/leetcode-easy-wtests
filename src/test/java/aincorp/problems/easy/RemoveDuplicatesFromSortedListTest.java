package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedListTest {

    private final RemoveDuplicatesFromSortedList removeDuplicates = new RemoveDuplicatesFromSortedList();

    @Test
    public void test() {
        assertEquals(null, removeDuplicates.deleteDuplicates(null));
        assertEquals(new ListNode(), removeDuplicates.deleteDuplicates(new ListNode()));
    }

    @Test
    public void when_listNode_one_element() {
        assertEquals(new ListNode(1), removeDuplicates.deleteDuplicates(new ListNode(1)));
    }

    @Test
    public void when_listNode_have_duplicates() {
        ListNode resulListNode = new ListNode(1, new ListNode(2, new ListNode(3)));
        assertEquals(resulListNode, removeDuplicates.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3))))));
    }

    @Test
    public void when_listNode_have_duplicates_in_tail() {
        ListNode resulListNode = new ListNode(1, new ListNode(2, new ListNode(3)));
        assertEquals(resulListNode, removeDuplicates.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))))));
    }

}