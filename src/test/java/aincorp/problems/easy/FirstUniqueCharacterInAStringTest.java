package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharacterInAStringTest {

    private final FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();

    @Test
    void test() {
        assertEquals(0, firstUniqueCharacterInAString.firstUniqChar("leetcode"));
        assertEquals(2, firstUniqueCharacterInAString.firstUniqChar("loveleetcode"));
        assertEquals(-1, firstUniqueCharacterInAString.firstUniqChar("aabb"));
    }

}