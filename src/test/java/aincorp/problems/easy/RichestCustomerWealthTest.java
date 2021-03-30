package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RichestCustomerWealthTest {

    RichestCustomerWealth richestCustomerWealth;

    @Test
    void maximumWealth() {
        richestCustomerWealth = new RichestCustomerWealth();
        assertEquals(6, richestCustomerWealth.maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
        assertEquals(10, richestCustomerWealth.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}));
        assertEquals(17, richestCustomerWealth.maximumWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}));
    }
}