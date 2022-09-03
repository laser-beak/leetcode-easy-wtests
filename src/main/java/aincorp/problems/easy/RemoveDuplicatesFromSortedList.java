package aincorp.problems.easy;

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode result;

        ListNode root = new ListNode();

        ListNode temp = root;
        while (head != null) {
            if (head.next != null && head.val != head.next.val) {
                while (temp.next == null) {
                    temp.next = new ListNode(head.val);
                }
                temp = temp.next;
            } else if (head.next == null) {
                while (temp.next == null) {
                    temp.next = new ListNode(head.val);
                }
                temp = temp.next;
            }
            head = head.next;
        }

        result = root.next;

        return result;
    }
}
