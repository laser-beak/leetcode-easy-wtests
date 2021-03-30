package aincorp.problems.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixDiagonalSumTest {

    MatrixDiagonalSum matrixDiagonalSum;

    @DisplayName("MatrixDiagonalSum.diagonalSum")
    @Test
    void diagonalSum() {
        matrixDiagonalSum = new MatrixDiagonalSum();

        assertEquals(25, matrixDiagonalSum.diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertEquals(8, matrixDiagonalSum.diagonalSum(new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}}));
    }
}