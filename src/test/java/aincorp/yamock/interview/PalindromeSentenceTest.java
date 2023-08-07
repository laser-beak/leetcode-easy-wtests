package aincorp.yamock.interview;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeSentenceTest {

    private final PalindromeSentence palindromeSentence = new PalindromeSentence();

    @Test
    void test() {
        assertFalse(palindromeSentence.isPalindromeSentence(""));
        assertFalse(palindromeSentence.isPalindromeSentence(null));
        assertFalse(palindromeSentence.isPalindromeSentence(" "));
        assertTrue(palindromeSentence.isPalindromeSentence("Довод"));
        assertTrue(palindromeSentence.isPalindromeSentence("довод"));
        assertFalse(palindromeSentence.isPalindromeSentence("вода"));
        assertFalse(palindromeSentence.isPalindromeSentence("ВодА"));
        assertTrue(palindromeSentence.isPalindromeSentence("Д о В о д"));
        assertTrue(palindromeSentence.isPalindromeSentence("Самое, оно Еомас "));
        assertTrue(palindromeSentence.isPalindromeSentence(" Сам оо , Мас "));
    }

}