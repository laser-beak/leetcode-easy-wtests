package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianOfTwoSortedArraysTest {

    @Test
    public void when_zero_arrays_is_zero_answer() {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        int[] nums1 = new int[]{0, 0};
        int[] nums2 = new int[]{0, 0};

        assertEquals(0.00000, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

}