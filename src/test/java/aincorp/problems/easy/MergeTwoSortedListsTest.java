package aincorp.problems.easy;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
class MergeTwoSortedListsTest {

    @Test
    public void when_empty_list_empty_result() {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        ListNode l1 = null;
        ListNode l2 = null;

        assertEquals(null, mergeTwoSortedLists.mergeTwoLists(l1, l2));
    }

    @Test
    public void when_list_and_empty_list_one_result(){
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        ListNode l1 = null;
        ListNode l2 = new ListNode(0, null);

        assertEquals(l2, mergeTwoSortedLists.mergeTwoLists(l1, l2));
    }

    @Test
    public void when_not_empty_lists_result(){
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));

        ListNode result = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4, null))))));

        assertEquals(result, mergeTwoSortedLists.mergeTwoLists(l1, l2));
    }

    @Test
    public void when_list_one_list_two_result(){
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        ListNode l1 = new ListNode(1, null);
        ListNode l2 = new ListNode(2, null);

        assertEquals(l2, mergeTwoSortedLists.mergeTwoLists(l1, l2));
    }

}