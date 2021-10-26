package aincorp.problems.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class IntersectionOfTwoArraysTest {

    @Test
    public void whenArrayTwoAndOneNumberResultArrayTwo() {
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        Assert.assertArrayEquals(new int[]{2}, intersectionOfTwoArrays.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }

    @Test
    public void whenArrayNumberResultArrayTwo() {
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();

        Assert.assertArrayEquals(new int[]{4, 9}, intersectionOfTwoArrays.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
    }

}