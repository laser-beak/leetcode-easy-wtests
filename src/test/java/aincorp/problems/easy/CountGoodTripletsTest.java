package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountGoodTripletsTest {

    private CountGoodTriplets countGoodTriplets = new CountGoodTriplets();

    @Test
    void test() {
        assertEquals(0, countGoodTriplets.countGoodTriplets(new int[]{1, 1, 2, 2, 3}, 0, 0, 1));
        assertEquals(4, countGoodTriplets.countGoodTriplets(new int[]{3, 0, 1, 1, 9, 7}, 7, 2, 3));
    }

}