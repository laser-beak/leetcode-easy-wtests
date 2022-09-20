package aincorp.problems.easy;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode resultListNode = new ListNode();
        ListNode currentListNode = resultListNode;

        while (l1 != null || l2 != null) {
            ListNode nextListNode = new ListNode();

            if (l1 == null) {
                nextListNode.val = l2.val;
                l2 = l2.next;
            } else if (l2 == null) {
                nextListNode.val = l1.val;
                l1 = l1.next;
            } else if (l1.val > l2.val) {
                nextListNode.val = l2.val;
                l2 = l2.next;
            } else {
                nextListNode.val = l1.val;
                l1 = l1.next;
            }

            currentListNode.next = nextListNode;
            currentListNode = nextListNode;
        }

        return resultListNode.next;
    }

    /*ListNode newHead = new ListNode();
    ListNode curr = newHead;
        while(list1 != null && list2 != null) {
        if(list1.val < list2.val) {
            curr.next = list1;
            list1 = list1.next;
        } else {
            curr.next = list2;
            list2 = list2.next;
        }
        curr = curr.next;
    }
        if(list1 != null) curr.next = list1;
        if(list2 != null) curr.next = list2;
        return newHead.next;*/
}
