package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    void test() {
        assertArrayEquals(new int[]{4, 6}, twoSum.twoSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10));
    }

}