package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PascalsTriangleTest {

    private final PascalsTriangle pascalsTriangle = new PascalsTriangle();

    @Test
    public void test() {
        assertEquals(Arrays.asList(Arrays.asList(1)), pascalsTriangle.generate(1));
        assertEquals(Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1), Arrays.asList(1, 2, 1), Arrays.asList(1, 3, 3, 1), Arrays.asList(1, 4, 6, 4, 1)), pascalsTriangle.generate(5));
    }

}