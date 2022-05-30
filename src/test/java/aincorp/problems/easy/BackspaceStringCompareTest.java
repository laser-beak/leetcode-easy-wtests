package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BackspaceStringCompareTest {
    private final BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();

    @Test
    public void test() {
        assertTrue(backspaceStringCompare.backspaceCompare("", ""));
        assertTrue(backspaceStringCompare.backspaceCompare("ab#c", "ad#c"));
        assertTrue(backspaceStringCompare.backspaceCompare("ab##", "c#d#"));
        assertFalse(backspaceStringCompare.backspaceCompare("a#c", "b"));
        assertTrue(backspaceStringCompare.backspaceCompare("a##c", "#a#c"));
    }
}