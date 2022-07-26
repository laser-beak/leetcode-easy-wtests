package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountEqualAndDivisiblePairsInAnArrayTest {

    private final CountEqualAndDivisiblePairsInAnArray count = new CountEqualAndDivisiblePairsInAnArray();

    @Test
    public void test() {
        assertEquals(0, count.countPairs(new int[]{1, 2, 3, 4}, 1));
        assertEquals(4, count.countPairs(new int[]{3, 1, 2, 2, 2, 1, 3}, 2));
    }

}