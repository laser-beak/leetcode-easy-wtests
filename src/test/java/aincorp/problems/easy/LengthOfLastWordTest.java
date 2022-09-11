package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLastWordTest {

    private final LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

    @Test
    public void test() {
        assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
        assertEquals(4, lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
    }

}