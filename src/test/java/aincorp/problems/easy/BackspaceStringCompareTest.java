package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackspaceStringCompareTest {

    private final BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();

    @Test
    public void true_when_strings_empty() {
        assertEquals(true, backspaceStringCompare.backspaceCompare("", ""));
    }

    @Test
    public void true_when_strings_become_same() {
        assertEquals(true, backspaceStringCompare.backspaceCompare("ab#c", "ad#c"));
    }

    @Test
    public void true_when_strings_become_same_eq_empty() {
        assertEquals(true, backspaceStringCompare.backspaceCompare("ab##", "c#d#"));
    }

    @Test
    public void false_when_strings_become_not_same() {
        assertEquals(false, backspaceStringCompare.backspaceCompare("a#c", "b"));
    }

    @Test
    public void true_when_empty_stack() {
        assertEquals(true, backspaceStringCompare.backspaceCompare("a##c", "#a#c"));
    }

}