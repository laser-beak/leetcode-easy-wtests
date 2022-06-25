package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

class IntersectionOfTwoArraysTest {
    private final IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();

    @Test
    public void test() {
        assertArrayEquals(new int[]{2}, intersectionOfTwoArrays.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{4, 9}, intersectionOfTwoArrays.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
    }
}