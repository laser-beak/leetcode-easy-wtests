package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RunningSumOf1DArrayTest {
    private final RunningSumOf1dArray runningSumof1dArray = new RunningSumOf1dArray();

    @Test
    public void test_empty_array() {
        int[] result = new int[0];
        assertArrayEquals(result, runningSumof1dArray.runningSum(result));
    }

    @Test
    public void first_test() {
        int[] input = new int[]{1, 2, 3, 4};
        int[] output = new int[]{1, 3, 6, 10};
        assertArrayEquals(output, runningSumof1dArray.runningSum(input));
    }

    @Test
    public void second_test() {
        int[] input = new int[]{1, 1, 1, 1, 1};
        int[] output = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(output, runningSumof1dArray.runningSum(input));
    }
}