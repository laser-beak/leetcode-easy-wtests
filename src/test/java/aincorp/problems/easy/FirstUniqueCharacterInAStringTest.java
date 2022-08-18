package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInAStringTest {

    private final FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();

    @Test
    public void test() {
        assertEquals(0, firstUniqueCharacterInAString.firstUniqChar("leetcode"));
        assertEquals(2, firstUniqueCharacterInAString.firstUniqChar("loveleetcode"));
        assertEquals(-1, firstUniqueCharacterInAString.firstUniqChar("aabb"));
    }

}