package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheHighestAltitudeTest {

    private final FindTheHighestAltitude findTheHighestAltitude = new FindTheHighestAltitude();

    @Test
    void test() {
        assertEquals(0, findTheHighestAltitude.largestAltitude(new int[]{}));
        assertEquals(1, findTheHighestAltitude.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
        assertEquals(0, findTheHighestAltitude.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
    }

}