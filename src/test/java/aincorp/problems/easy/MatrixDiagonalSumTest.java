package aincorp.problems.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixDiagonalSumTest {
    private final MatrixDiagonalSum matrixDiagonalSum = new MatrixDiagonalSum();

    @DisplayName("MatrixDiagonalSum.diagonalSum")
    @Test
    public void diagonalSum() {
        assertEquals(25, matrixDiagonalSum.diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertEquals(8, matrixDiagonalSum.diagonalSum(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}));
    }
}