package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueMorseCodeWordsTest {

    private final UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();

    @Test
    public void test() {
        assertEquals(0, uniqueMorseCodeWords.uniqueMorseRepresentations(new String[]{}));
        assertEquals(2, uniqueMorseCodeWords.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
        assertEquals(1, uniqueMorseCodeWords.uniqueMorseRepresentations(new String[]{"a"}));
    }

}