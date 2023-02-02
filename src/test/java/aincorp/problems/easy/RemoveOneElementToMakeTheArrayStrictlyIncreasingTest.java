package aincorp.problems.easy;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RemoveOneElementToMakeTheArrayStrictlyIncreasingTest {

    private final RemoveOneElementToMakeTheArrayStrictlyIncreasing remove = new RemoveOneElementToMakeTheArrayStrictlyIncreasing();

    @Ignore
    @Test
    public void test() {
        //assertFalse(remove.canBeIncreasing(new int[]{}));
        assertTrue(remove.canBeIncreasing(new int[]{1, 2, 10, 5, 7}));
        assertFalse(remove.canBeIncreasing(new int[]{2, 3, 1, 2}));
        assertFalse(remove.canBeIncreasing(new int[]{1, 1, 1}));
    }

}