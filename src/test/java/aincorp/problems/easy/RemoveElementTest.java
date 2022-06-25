package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementTest {

    private final RemoveElement removeElement = new RemoveElement();

    @Test
    public void test() {
        assertEquals(0, removeElement.removeElement(new int[]{}, 0));
    }
}