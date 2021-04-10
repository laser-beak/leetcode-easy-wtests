package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    public void whenNumsLengthOneTargetZeroResultZero() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        assertEquals(0, searchInsertPosition.searchInsert(new int[]{1}, 0));
    }

    @Test
    public void whenInsertIndexTwo() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        assertEquals(2, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 5));
    }

    @Test
    public void whenInsertIndexOne() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        assertEquals(1, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 2));
    }

    @Test
    public void whenInsertIndexZero() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        assertEquals(0, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 0));
    }

    @Test
    public void whenNumsLengthOneInsertIndexOne() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        assertEquals(0, searchInsertPosition.searchInsert(new int[]{1}, 0));
    }

    @Test
    public void whenNumsLengthFourInsertIndexSeven() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        assertEquals(4, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 7));
    }

}