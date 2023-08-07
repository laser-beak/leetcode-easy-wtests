package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DifferenceBetweenElementSumAndDigitSumOfAnArrayTest {

    private DifferenceBetweenElementSumAndDigitSumOfAnArray difference = new DifferenceBetweenElementSumAndDigitSumOfAnArray();

    @Test
    void test() {
        assertEquals(9, difference.differenceOfSum(new int[]{1, 15, 6, 3}));
        assertEquals(0, difference.differenceOfSum(new int[]{1, 2, 3, 4}));
    }

}