package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackspaceStringCompareTest {

    private final BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();

    @Test
    public void true_when_strings_empty() {
        assertTrue(backspaceStringCompare.backspaceCompare("", ""));
    }

    @Test
    public void true_when_strings_become_same() {
        assertTrue(backspaceStringCompare.backspaceCompare("ab#c", "ad#c"));
    }

    @Test
    public void true_when_strings_become_same_eq_empty() {
        assertTrue(backspaceStringCompare.backspaceCompare("ab##", "c#d#"));
    }

    @Test
    public void false_when_strings_become_not_same() {
        assertFalse(backspaceStringCompare.backspaceCompare("a#c", "b"));
    }

    @Test
    public void true_when_empty_stack() {
        assertTrue(backspaceStringCompare.backspaceCompare("a##c", "#a#c"));
    }

}