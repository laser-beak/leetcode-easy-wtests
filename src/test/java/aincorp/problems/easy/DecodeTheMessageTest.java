package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecodeTheMessageTest {

    private final DecodeTheMessage decodeTheMessage = new DecodeTheMessage();

    @Test
    void test() {
        assertEquals("this is a secret", decodeTheMessage.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
        assertEquals("the five boxing wizards jump quickly", decodeTheMessage.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }

}