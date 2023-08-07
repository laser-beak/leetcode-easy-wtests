package aincorp.problems.easy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfUniqueElementsTest {

    private final SumOfUniqueElements sum = new SumOfUniqueElements();

    @Test
    void test() {
        assertEquals(4, sum.sumOfUnique(new int[]{1, 2, 3, 2}));
        assertEquals(0, sum.sumOfUnique(new int[]{1, 1, 1, 1, 1}));
        assertEquals(15, sum.sumOfUnique(new int[]{1, 2, 3, 4, 5}));
        assertEquals(25, sum.sumOfUnique(new int[]{10, 6, 9, 6, 9, 6, 8, 7}));
        assertEquals(10, sum.sumOfUnique(new int[]{10}));
    }

}