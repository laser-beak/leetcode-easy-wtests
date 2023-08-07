package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayTest {
    private final MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    public void test_when_n_is_zero() {
        assertArrayEquals(new int[]{1}, mergeSortedArray.merge(new int[]{1}, 1, new int[]{}, 0));
    }

    @Test
    public void test_when_m_is_zero_nums2_empty() {
        assertArrayEquals(new int[]{1}, mergeSortedArray.merge(new int[]{0}, 0, new int[]{1}, 1));
    }

    @Test
    public void test() {
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, mergeSortedArray.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3));
    }

    @Test
    public void test_nums1_is_zeroes() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, mergeSortedArray.merge(new int[]{0, 0, 0, 0, 0}, 0, new int[]{1, 2, 3, 4, 5}, 5));
    }
}