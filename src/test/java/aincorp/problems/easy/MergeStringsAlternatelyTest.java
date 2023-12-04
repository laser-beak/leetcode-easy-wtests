package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {

    private final MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();

    @Test
    void test() {
        assertEquals("apbqcr", mergeStringsAlternately.mergeAlternately("abc", "pqr"));
        assertEquals("apbqrs", mergeStringsAlternately.mergeAlternately("ab", "pqrs"));
    }

}