package aincorp.problems.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractProductAndSumOfDigitsOfAnIntegerTest {
    private final SubtractProductAndSumOfDigitsOfAnInteger subtractProductAndSumOfDigitsOfAnInteger = new SubtractProductAndSumOfDigitsOfAnInteger();

    @DisplayName("SubtractProductAndSumOfDigitsOfAnInteger.subtractProductAndSum")
    @Test
    void test() {
        assertEquals(21, subtractProductAndSumOfDigitsOfAnInteger.subtractProductAndSum(4421));
        assertEquals(15, subtractProductAndSumOfDigitsOfAnInteger.subtractProductAndSum(234));
    }
}