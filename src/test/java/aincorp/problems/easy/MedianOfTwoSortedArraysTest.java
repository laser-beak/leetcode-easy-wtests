package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianOfTwoSortedArraysTest {
    private final MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();

    @Test
    public void when_zero_arrays_is_zero_answer() {
        assertEquals(0.00000, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0}));
    }
}