package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumMatrixTest {
    private NumMatrix numMatrix = new NumMatrix(
            new int[][]{
                    {3, 0, 1, 4, 2},
                    {5, 6, 3, 2, 1},
                    {1, 2, 0, 1, 5},
                    {4, 1, 0, 1, 7},
                    {1, 0, 3, 0, 5}
            }
    );

    @Test
    public void test() {
        assertEquals(8, numMatrix.sumRegion(2, 1, 4, 3));
        assertEquals(11, numMatrix.sumRegion(1, 1, 2, 2));
        assertEquals(12, numMatrix.sumRegion(1, 2, 2, 4));
    }
}