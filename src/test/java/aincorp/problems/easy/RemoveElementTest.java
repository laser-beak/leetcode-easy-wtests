package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementTest {
    private final RemoveElement removeElement = new RemoveElement();

    @Test
    public void test() {
        assertEquals(0, removeElement.removeElement(new int[]{}, 0));
        assertEquals(2, removeElement.removeElement(new int[]{3, 2, 2, 3}, 3));
        assertEquals(5, removeElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}