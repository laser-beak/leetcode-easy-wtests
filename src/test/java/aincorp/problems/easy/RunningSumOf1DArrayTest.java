package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RunningSumOf1DArrayTest {
    private final RunningSumOf1dArray runningSumof1dArray = new RunningSumOf1dArray();

    @Test
    public void test_empty_array() {
        assertArrayEquals(new int[0], runningSumof1dArray.runningSum(new int[0]));
    }

    @Test
    public void first_test() {
        assertArrayEquals(new int[]{1, 3, 6, 10}, runningSumof1dArray.runningSum(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void second_test() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, runningSumof1dArray.runningSum(new int[]{1, 1, 1, 1, 1}));
    }
}