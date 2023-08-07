package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SeparateTheDigitsInAnArrayTest {

    private final SeparateTheDigitsInAnArray digits = new SeparateTheDigitsInAnArray();

    @Test
    void test() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 8, 3, 7, 7}, digits.separateDigits(new int[]{13, 25, 83, 77}));
        assertArrayEquals(new int[]{7, 1, 3, 9}, digits.separateDigits(new int[]{7, 1, 3, 9}));
    }

}