package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class PalindromeLinkedListTest {
    private final PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

    @Test
    public void test() {
        ListNode actual = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        assertFalse(palindromeLinkedList.isPalindrome(actual));

        ListNode actual1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        assertTrue(palindromeLinkedList.isPalindrome(actual1));

        ListNode actual2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
        assertTrue(palindromeLinkedList.isPalindrome(actual2));
    }
}