package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {

    @Test
    public void when_steps_three_output_is_three() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
    }

    @Test
    public void when_steps_zero_output_is_zero() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(0, climbingStairs.climbStairs(0));
    }
}
