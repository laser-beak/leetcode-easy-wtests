package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumProductOfTwoElementsInAnArrayTest {

    private final MaximumProductOfTwoElementsInAnArray max = new MaximumProductOfTwoElementsInAnArray();

    @Test
    public void test() {
        assertEquals(0, max.maxProduct(new int[]{}));
        assertEquals(12, max.maxProduct(new int[]{3, 7}));
        assertEquals(12, max.maxProduct(new int[]{3, 4, 5, 2}));
        assertEquals(16, max.maxProduct(new int[]{1, 5, 4, 5}));
    }

}