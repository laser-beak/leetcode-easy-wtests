package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GoalParserInterpretationTest {
    private final GoalParserInterpretation goalParserInterpretation = new GoalParserInterpretation();

    @Test
    void test() {
        assertEquals("Goal", goalParserInterpretation.interpret("G()(al)"));
        assertEquals("Gooooal", goalParserInterpretation.interpret("G()()()()(al)"));
    }
}