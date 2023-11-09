package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingTheSentenceTest {

    private SortingTheSentence sortingTheSentence = new SortingTheSentence();

    @Test
    void test() {
        assertEquals("This is a sentence", sortingTheSentence.sortSentence("is2 sentence4 This1 a3"));
    }

}