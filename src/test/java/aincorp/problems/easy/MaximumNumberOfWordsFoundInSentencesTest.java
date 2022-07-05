package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumNumberOfWordsFoundInSentencesTest {

    private MaximumNumberOfWordsFoundInSentences numberOfWordsFoundInSentences = new MaximumNumberOfWordsFoundInSentences();

    @Test
    public void test() {
        assertEquals(6, numberOfWordsFoundInSentences.mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
        assertEquals(3, numberOfWordsFoundInSentences.mostWordsFound(new String[]{"please wait", "continue to fight", "continue to win"}));
    }

}