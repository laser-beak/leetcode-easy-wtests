package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortThePeopleTest {

    private SortThePeople sortThePeople = new SortThePeople();

    @Test
    public void test() {
        assertArrayEquals(new String[]{"Mary", "Emma", "John"}, sortThePeople.sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170}));
        assertArrayEquals(new String[]{"Bob", "Alice", "Bob"}, sortThePeople.sortPeople(new String[]{"Alice", "Bob", "Bob"}, new int[]{155, 185, 150}));
    }

}