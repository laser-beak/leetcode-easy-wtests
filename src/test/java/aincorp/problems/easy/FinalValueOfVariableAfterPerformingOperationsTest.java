package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FinalValueOfVariableAfterPerformingOperationsTest {

    private final FinalValueOfVariableAfterPerformingOperations afterPerformingOperations = new FinalValueOfVariableAfterPerformingOperations();

    @Test
    void test() {
        assertEquals(3, afterPerformingOperations.finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));
        assertEquals(0, afterPerformingOperations.finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"}));
    }

}