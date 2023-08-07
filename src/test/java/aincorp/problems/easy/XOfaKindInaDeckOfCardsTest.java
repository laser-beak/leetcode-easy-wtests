package aincorp.problems.easy;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled
class XOfaKindInaDeckOfCardsTest {

    private final XOfaKindInaDeckOfCards xOfaKindInaDeckOfCards = new XOfaKindInaDeckOfCards();

    @Test
    void test() {
        assertTrue(xOfaKindInaDeckOfCards.hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1}));
        assertFalse(xOfaKindInaDeckOfCards.hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3}));
    }

}