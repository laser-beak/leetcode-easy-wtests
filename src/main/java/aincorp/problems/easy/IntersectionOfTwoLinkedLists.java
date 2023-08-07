package aincorp.problems.easy;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aHeadSize = 0;
        int bHeadSize = 0;

        ListNode rootA = headA;
        ListNode rootB = headB;

        while (rootA != null) {
            aHeadSize++;
            rootA = rootA.next;
        }

        while (rootB != null) {
            bHeadSize++;
            rootB = rootB.next;
        }

        int sub = 0;

        if (aHeadSize >= bHeadSize) {
            sub = aHeadSize - bHeadSize;
            for (int i = 0; i < sub; i++) {
                headA = headA.next;
            }

            while (headA != null) {
                if (headA.val == headB.val) {
                    headA.next = null;
                    return headA;
                }
                headA = headA.next;
                headB = headB.next;
            }

        } else {
            sub = bHeadSize - aHeadSize;
            for (int i = 0; i < sub; i++) {
                headB = headB.next;
            }

            while (headB != null) {
                if (headB.val == headA.val) {
                    headB.next = null;
                    return headB;
                }
                headB = headB.next;
                headA = headA.next;
            }
        }

        return null;
    }
}
