package aincorp.algoexpert;


import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


@Disabled
class SortedSquaredArrayTest {

    private final SortedSquaredArray sortedSquaredArray = new SortedSquaredArray();

    @Ignore("Not done yet")
    @Test
    void test() {
        assertArrayEquals(new int[]{0, 0, 1, 1, 1, 4, 4, 9, 169, 361, 400, 2500}, sortedSquaredArray.sortedSquaredArray(new int[]{-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20}));
        assertArrayEquals(new int[]{1, 9, 49, 81, 484, 900}, sortedSquaredArray.sortedSquaredArray(new int[]{-7, -3, 1, 9, 22, 30}));
        assertArrayEquals(new int[]{0, 25, 25, 100, 100}, sortedSquaredArray.sortedSquaredArray(new int[]{-10, -5, 0, 5, 10}));
    }

}