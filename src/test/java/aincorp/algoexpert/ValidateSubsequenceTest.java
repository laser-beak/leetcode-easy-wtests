package aincorp.algoexpert;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidateSubsequenceTest {

    private final ValidateSubsequence validateSubsequence = new ValidateSubsequence();

    @Test
    void test() {
        assertFalse(validateSubsequence.isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10), Arrays.asList(5, 1, 25, 22, 6, -1, 8, 10)));
        assertTrue(validateSubsequence.isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10), Arrays.asList(1, 6, -1, 10)));
        assertFalse(validateSubsequence.isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10), Arrays.asList(5, 1, 22, 22, 25, 6, -1, 8, 10)));
        assertTrue(validateSubsequence.isValidSubsequence(Arrays.asList(1, 1, 1, 1, 1), Arrays.asList(1, 1, 1)));
    }

}