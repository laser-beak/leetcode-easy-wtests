package aincorp.netera;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueTest {

    private final FirstUnique firstUnique = new FirstUnique();

    @Test
    void test() {
        assertEquals(-1, firstUnique.firstUnique(""));
        assertEquals(0, firstUnique.firstUnique("leetcode"));
        assertEquals(-1, firstUnique.firstUnique("aabb"));
        assertEquals(2, firstUnique.firstUnique("loveleetcode"));
    }

}