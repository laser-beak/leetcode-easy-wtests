package aincorp.problems.easy;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
class SumOfAllSubsetXORTotalsTest {

    private final SumOfAllSubsetXORTotals sum = new SumOfAllSubsetXORTotals();

    @Test
    public void test() {
        assertEquals(0, sum.subsetXORSum(new int[]{}));
        assertEquals(6, sum.subsetXORSum(new int[]{1, 3}));
        assertEquals(28, sum.subsetXORSum(new int[]{5, 1, 6}));
        assertEquals(480, sum.subsetXORSum(new int[]{3, 4, 5, 6, 7, 8}));
    }

}