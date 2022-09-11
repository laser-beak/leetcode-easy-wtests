package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {

    private final ValidAnagram validAnagram = new ValidAnagram();

    @Test
    public void test() {
        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
        assertFalse(validAnagram.isAnagram("rat", "car"));
        assertFalse(validAnagram.isAnagram("aa", "bb"));
    }
}