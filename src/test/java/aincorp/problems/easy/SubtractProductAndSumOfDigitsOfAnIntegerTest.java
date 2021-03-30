package aincorp.problems.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractProductAndSumOfDigitsOfAnIntegerTest {

    SubtractProductAndSumOfDigitsOfAnInteger subtractProductAndSumOfDigitsOfAnInteger;

    @DisplayName("SubtractProductAndSumOfDigitsOfAnInteger.subtractProductAndSum")
    @Test
    void subtractProductAndSum() {
        subtractProductAndSumOfDigitsOfAnInteger = new SubtractProductAndSumOfDigitsOfAnInteger();

        assertEquals(21, subtractProductAndSumOfDigitsOfAnInteger.subtractProductAndSum(4421));
        assertEquals(15, subtractProductAndSumOfDigitsOfAnInteger.subtractProductAndSum(234));
    }
}