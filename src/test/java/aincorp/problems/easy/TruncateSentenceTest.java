package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TruncateSentenceTest {

    private final TruncateSentence truncateSentence = new TruncateSentence();

    @Test
    void test() {
        assertEquals("Hello how are you", truncateSentence.truncateSentence("Hello how are you Contestant", 4));
        assertEquals("What is the solution", truncateSentence.truncateSentence("What is the solution to this problem", 4));
        assertEquals("chopper is not a tanuki", truncateSentence.truncateSentence("chopper is not a tanuki", 5));
    }

}