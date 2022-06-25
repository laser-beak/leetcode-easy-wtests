package aincorp.problems.easy;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode curr = l1;

        while (curr != null) {
            ListNode next = curr.next;

            ListNode curr2 = l2;
            while (curr2 != null) {
                ListNode next2 = curr2.next;
                if (curr.val == curr2.val) {
                    ListNode insert = new ListNode(curr.val, null);
                    curr2.next = insert;
                    insert.next = next2;
                    break;
                } else {
                    if (curr2.next != null) {
                        if (curr.val < curr2.next.val) {
                            ListNode insert = new ListNode(curr.val, null);
                            curr2.next = insert;
                            insert.next = next2;
                            break;
                        }
                    } else {
                        if (curr.val < curr2.val) {
                            ListNode insert = new ListNode(curr2.val, null);
                            curr.next = insert;
                            insert.next = null;
                            l2 = l1;
                            break;
                        } else {
                            curr2.next = curr;
                        }
                        break;
                    }
                }
                curr2 = next2;
            }

            curr = next;
        }
        if (l2 == null) {
            return l1;
        }

        return l2;

    }
}
