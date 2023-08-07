package aincorp.problems.easy;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode some = copy(head);
        ListNode reversed = reverse(head);

        while (some != null && reversed != null) {
            if (some.val != reversed.val) {
                return false;
            }
            some = some.next;
            reversed = reversed.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode next;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    public ListNode copy(ListNode list) {
        if (list == null)
            return null;

        ListNode res = new ListNode(list.val);
        ListNode resTmp = res;
        ListNode listTmp = list;

        while (listTmp.next != null) {
            listTmp = listTmp.next;
            resTmp.next = new ListNode(listTmp.val);
            resTmp = resTmp.next;
        }

        return res;
    }
}
