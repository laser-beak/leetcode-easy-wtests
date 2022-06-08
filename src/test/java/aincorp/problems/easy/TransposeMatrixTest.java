package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransposeMatrixTest {

    private final TransposeMatrix transposeMatrix = new TransposeMatrix();

    @Test
    public void first_test() {
        int[][] input = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] output = new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        assertArrayEquals(output, transposeMatrix.transpose(input));
    }

    @Test
    public void second_test() {
        int[][] input = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] output = new int[][]{{1, 4}, {2, 5}, {3, 6}};
        assertArrayEquals(output, transposeMatrix.transpose(input));
    }
}