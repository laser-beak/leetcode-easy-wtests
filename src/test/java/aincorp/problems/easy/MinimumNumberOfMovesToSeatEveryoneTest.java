package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumNumberOfMovesToSeatEveryoneTest {

    private final MinimumNumberOfMovesToSeatEveryone number = new MinimumNumberOfMovesToSeatEveryone();

    @Test
    void test() {
        assertEquals(4, number.minMovesToSeat(new int[]{3, 1, 5}, new int[]{2, 7, 4}));
        assertEquals(7, number.minMovesToSeat(new int[]{4, 1, 5, 9}, new int[]{1, 3, 2, 6}));
        assertEquals(4, number.minMovesToSeat(new int[]{2, 2, 6, 6}, new int[]{1, 3, 2, 6}));
    }

}