package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoalParserInterpretationTest {

    @Test
    void interpret_one() {
        GoalParserInterpretation goalParserInterpretation = new GoalParserInterpretation();
        assertEquals("Goal", goalParserInterpretation.interpret("G()(al)"));
    }

    @Test
    void interpret_two() {
        GoalParserInterpretation goalParserInterpretation = new GoalParserInterpretation();
        assertEquals("Gooooal", goalParserInterpretation.interpret("G()()()()(al)"));
    }
}