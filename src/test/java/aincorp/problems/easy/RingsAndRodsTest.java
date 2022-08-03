package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RingsAndRodsTest {

    private final RingsAndRods ringsAndRods = new RingsAndRods();

    @Test
    public void test() {
        assertEquals(1, ringsAndRods.countPoints("B0B6G0R6R0R6G9"));
        assertEquals(1, ringsAndRods.countPoints("B0R0G0R9R0B0G0"));
        assertEquals(1, ringsAndRods.countPoints("B0R0G0R9R0B0G0"));
        assertEquals(0, ringsAndRods.countPoints("G4"));
    }

}