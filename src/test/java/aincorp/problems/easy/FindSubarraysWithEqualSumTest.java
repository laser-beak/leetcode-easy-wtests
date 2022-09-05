package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FindSubarraysWithEqualSumTest {

    private final FindSubarraysWithEqualSum findSubarraysWithEqualSum = new FindSubarraysWithEqualSum();

    @Test
    public void test() {
        assertTrue(findSubarraysWithEqualSum.findSubarrays(new int[]{4, 2, 4}));
        assertTrue(findSubarraysWithEqualSum.findSubarrays(new int[]{0, 0, 0}));
        assertFalse(findSubarraysWithEqualSum.findSubarrays(new int[]{1, 2, 3, 4, 5}));
    }

}