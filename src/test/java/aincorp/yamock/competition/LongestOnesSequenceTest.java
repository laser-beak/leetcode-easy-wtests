package aincorp.yamock.competition;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestOnesSequenceTest {

    private final LongestOnesSequence longestOnesSequence = new LongestOnesSequence();

    @Test
    public void test() {
        assertEquals(1, longestOnesSequence.longestOnesSequence(Arrays.asList(5, 1, 0, 1, 0, 1)));
        assertEquals(2, longestOnesSequence.longestOnesSequence(Arrays.asList(5, 1, 0, 0, 1, 1)));
        assertEquals(3, longestOnesSequence.longestOnesSequence(Arrays.asList(5, 1, 0, 1, 1, 1, 0, 1, 1)));
    }

}