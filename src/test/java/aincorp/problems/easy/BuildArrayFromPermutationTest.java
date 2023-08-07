package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BuildArrayFromPermutationTest {

    private final BuildArrayFromPermutation buildArrayFromPermutation = new BuildArrayFromPermutation();

    @Test
    void test() {
        assertArrayEquals(new int[]{0, 1, 2, 4, 5, 3}, buildArrayFromPermutation.buildArray(new int[]{0, 2, 1, 5, 3, 4}));
        assertArrayEquals(new int[]{4, 5, 0, 1, 2, 3}, buildArrayFromPermutation.buildArray(new int[]{5, 0, 1, 2, 3, 4}));
    }

}