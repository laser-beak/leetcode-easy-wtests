package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {

    @Test
    public void when_steps_two_output_is_two() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(2, climbingStairs.climbStairs(2));
    }

    @Test
    public void when_steps_three_output_is_three() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(3, climbingStairs.climbStairs(3));
    }

    @Test
    public void when_steps_four_output_is_five() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(5, climbingStairs.climbStairs(4));
    }

    @Test
    public void when_steps_five_output_is_eight() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(8, climbingStairs.climbStairs(5));
    }
}
