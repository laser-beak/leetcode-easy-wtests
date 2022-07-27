package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumTimeVisitingAllPointsTest {

    private final MinimumTimeVisitingAllPoints minimumTimeVisitingAllPoints = new MinimumTimeVisitingAllPoints();

    @Test
    public void test() {
        assertEquals(0, minimumTimeVisitingAllPoints.minTimeToVisitAllPoints(new int[][]{}));
        assertEquals(7, minimumTimeVisitingAllPoints.minTimeToVisitAllPoints(new int[][]{{1, 1}, {3, 4}, {-1, 0}}));
    }

}