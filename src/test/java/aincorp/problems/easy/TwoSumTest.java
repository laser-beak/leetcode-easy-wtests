package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    public void test() {
        assertArrayEquals(new int[]{11, -1}, twoSum.twoSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6},10));
    }

}