package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void whenNumsEmptyNumsLengthZero() {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int numsLength = removeDuplicatesFromSortedArray.removeDuplicates(new int[]{});

        assertEquals(0, numsLength);
    }

    @Test
    public void whenNumsNotEmptyNumsLengthTwo() {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int numsLength = removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 2});

        assertEquals(2, numsLength);
    }

    @Test
    public void whenNumsNotEmptyNumsLengthFive() {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int numsLength = removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});

        assertEquals(5, numsLength);
    }

}
