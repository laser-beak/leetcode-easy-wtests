package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ConcatenationOfArrayTest {

    private final ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();

    @Test
    public void test() {
        assertArrayEquals(new int[]{1, 2, 1, 1, 2, 1}, concatenationOfArray.getConcatenation(new int[]{1, 2, 1}));
        assertArrayEquals(new int[]{1, 3, 2, 1, 1, 3, 2, 1}, concatenationOfArray.getConcatenation(new int[]{1, 3, 2, 1}));
    }
}