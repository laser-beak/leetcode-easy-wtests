package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainsDuplicateTest {

    private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    void containsDuplicate() {
        assertEquals(true, containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertEquals(false, containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4}));
        assertEquals(true, containsDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}