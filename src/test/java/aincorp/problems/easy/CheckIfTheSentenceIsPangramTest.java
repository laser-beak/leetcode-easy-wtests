package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckIfTheSentenceIsPangramTest {

    private final CheckIfTheSentenceIsPangram pangram = new CheckIfTheSentenceIsPangram();

    @Test
    void test() {
        assertTrue(pangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        assertFalse(pangram.checkIfPangram("leetcode"));
        assertFalse(pangram.checkIfPangram("onrcsnlxckptsxffbyswujpamfltvmdoxovggepknmtacrjkkorjgvgtgaiaudspnpxkwikevmjeephhiyvnoymjwjfopovscbefecnoytjxfwasabwohqujwowmakpyuuqvgfab"));
    }

}