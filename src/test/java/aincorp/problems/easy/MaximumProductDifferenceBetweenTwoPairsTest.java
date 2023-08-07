package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumProductDifferenceBetweenTwoPairsTest {

    private final MaximumProductDifferenceBetweenTwoPairs pairs = new MaximumProductDifferenceBetweenTwoPairs();

    @Test
    void test() {
        assertEquals(34, pairs.maxProductDifference(new int[]{5, 6, 2, 7, 4}));
        assertEquals(64, pairs.maxProductDifference(new int[]{4, 2, 5, 9, 7, 4, 8}));
    }

}