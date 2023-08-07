package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfAllOddLengthSubarraysTest {

    private final SumOfAllOddLengthSubarrays sum = new SumOfAllOddLengthSubarrays();

    @Test
    void test() {
        assertEquals(3, sum.sumOddLengthSubarrays(new int[]{1, 2}));
        assertEquals(66, sum.sumOddLengthSubarrays(new int[]{10, 11, 12}));
        assertEquals(58, sum.sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));
    }

}