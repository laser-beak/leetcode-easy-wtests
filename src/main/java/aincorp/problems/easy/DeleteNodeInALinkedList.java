package aincorp.problems.easy;

public class DeleteNodeInALinkedList {

    public ListNode deleteNode(ListNode node, ListNode delete) {
        ListNode curr = node;
        ListNode next = node.next;

        while (curr != null) {
            if (curr.val == delete.val) {
                deleteNode(curr);
            }
            curr = curr.next;
            next = next.next;
        }

        return node;
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
