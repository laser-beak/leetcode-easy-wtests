package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DeleteNodeInALinkedListTest {

    private final DeleteNodeInALinkedList deleteNodeInALinkedList = new DeleteNodeInALinkedList();

    @Test
    public void LinkedList_Not_Have_Node_For_Delete() {
        ListNode actual = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        ListNode expected = new ListNode(4, new ListNode(1, new ListNode(9)));
        assertTrue(expected.equals(deleteNodeInALinkedList.deleteNode(actual, new ListNode(5))));
    }

    @Test
    public void LinkedList_Not_Another_Node_For_Delete() {
        ListNode actual = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        ListNode expected = new ListNode(4, new ListNode(5, new ListNode(9)));
        assertTrue(expected.equals(deleteNodeInALinkedList.deleteNode(actual, new ListNode(1))));
    }

}