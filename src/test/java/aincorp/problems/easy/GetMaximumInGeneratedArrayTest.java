package aincorp.problems.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetMaximumInGeneratedArrayTest {
    private final GetMaximumInGeneratedArray getMaximumInGeneratedArray = new GetMaximumInGeneratedArray();

    @DisplayName("GetMaximumInGeneratedArray.getMaximumGenerated")
    @Test
    void getMaximumGenerated() {
        assertEquals(3, getMaximumInGeneratedArray.getMaximumGenerated(7));
        assertEquals(1, getMaximumInGeneratedArray.getMaximumGenerated(2));
        assertEquals(2, getMaximumInGeneratedArray.getMaximumGenerated(3));
        assertEquals(2, getMaximumInGeneratedArray.getMaximumGenerated(4));
        assertEquals(0, getMaximumInGeneratedArray.getMaximumGenerated(0));
    }
}