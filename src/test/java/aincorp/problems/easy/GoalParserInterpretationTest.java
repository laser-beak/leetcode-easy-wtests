package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GoalParserInterpretationTest {

    private final GoalParserInterpretation goalParserInterpretation = new GoalParserInterpretation();

    @Test
    void interpret_one() {
        assertEquals("Goal", goalParserInterpretation.interpret("G()(al)"));
    }

    @Test
    void interpret_two() {
        assertEquals("Gooooal", goalParserInterpretation.interpret("G()()()()(al)"));
    }
}