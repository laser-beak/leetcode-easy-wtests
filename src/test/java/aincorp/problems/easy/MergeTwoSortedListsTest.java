package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoSortedListsTest {
    private final MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    void when_empty_list_empty_result() {
        assertEquals(null, mergeTwoSortedLists.mergeTwoLists(null, null));
    }

    @Test
    void when_list1_empty_list2_not_empty_list2_result() {
        assertEquals(new ListNode(0, null), mergeTwoSortedLists.mergeTwoLists(null, new ListNode(0, null)));
    }

    @Test
    void when_list2_empty_list1_not_empty_list1_result() {
        assertEquals(new ListNode(0, null), mergeTwoSortedLists.mergeTwoLists(new ListNode(0, null), null));
    }

    @Test
    void when_not_empty_lists_result() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));

        assertEquals(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4, null)))))), mergeTwoSortedLists.mergeTwoLists(l1, l2));
    }

    @Test
    void when_list1_list2_result() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);

        assertEquals(new ListNode(1, new ListNode(2)), mergeTwoSortedLists.mergeTwoLists(l1, l2));
    }
}