package aincorp.problems.easy;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
class MergeTwoSortedListsTest {
    private final MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    public void when_empty_list_empty_result() {
        assertEquals(null, mergeTwoSortedLists.mergeTwoLists(null, null));
    }

    @Test
    public void when_list_and_empty_list_one_result() {
        assertEquals(new ListNode(0, null), mergeTwoSortedLists.mergeTwoLists(null, new ListNode(0, null)));
    }

    @Test
    public void when_not_empty_lists_result() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));

        assertEquals(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4, null)))))), mergeTwoSortedLists.mergeTwoLists(l1, l2));
    }

    @Test
    public void when_list_one_list_two_result() {
        assertEquals(new ListNode(2, null), mergeTwoSortedLists.mergeTwoLists(new ListNode(1, null), new ListNode(2, null)));
    }
}