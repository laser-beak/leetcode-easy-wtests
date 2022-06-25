package aincorp.problems.easy;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
class AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        assertEquals(l1, addTwoNumbers.addTwoNumbers(l1, l2));
    }
}