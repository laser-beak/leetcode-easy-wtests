package aincorp.problems.easy;

import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
class IntersectionOfTwoLinkedListsTest {

    private final IntersectionOfTwoLinkedLists intersection = new IntersectionOfTwoLinkedLists();

    @Ignore
    @Test
    void test() {
        assertEquals(new ListNode(8), intersection.getIntersectionNode(new ListNode(4, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5))))), new ListNode(5, new ListNode(6, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5))))))));
    }

}