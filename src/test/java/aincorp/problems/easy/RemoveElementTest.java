package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementTest {

    @Test
    public void whenNumsContainsValueResultIsTwo() {
        RemoveElement removeElement = new RemoveElement();
        assertEquals(2, removeElement.removeElement(new int[]{3, 2, 2, 3}, 3));
    }

    @Test
    public void whenNumsContainsValueResultIsFive() {
        RemoveElement removeElement = new RemoveElement();
        assertEquals(5, removeElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    @Test
    public void whenNumsContainsTwoValueResultIsFive() {
        RemoveElement removeElement = new RemoveElement();
        assertEquals(1, removeElement.removeElement(new int[]{4, 5}, 4));
    }

    @Test
    public void whenNumsContainsTwoValueResultIsFive_New() {
        RemoveElement removeElement = new RemoveElement();
        assertEquals(1, removeElement.removeElement(new int[]{2, 2, 3}, 2));
    }

}