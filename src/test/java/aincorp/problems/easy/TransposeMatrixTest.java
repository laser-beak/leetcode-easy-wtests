package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TransposeMatrixTest {
    private final TransposeMatrix transposeMatrix = new TransposeMatrix();

    @Test
    void test() {
        assertArrayEquals(new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}, transposeMatrix.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertArrayEquals(new int[][]{{1, 4}, {2, 5}, {3, 6}}, transposeMatrix.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }
}