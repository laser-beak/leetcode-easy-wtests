package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountNumberOfPairsWithAbsoluteDifferenceKTest {

    private final CountNumberOfPairsWithAbsoluteDifferenceK count = new CountNumberOfPairsWithAbsoluteDifferenceK();

    @Test
    public void test() {
        assertEquals(4, count.countKDifference(new int[]{1, 2, 2, 1}, 1));
        assertEquals(0, count.countKDifference(new int[]{1, 3}, 3));
        assertEquals(3, count.countKDifference(new int[]{3, 2, 1, 5, 4}, 2));
    }

}