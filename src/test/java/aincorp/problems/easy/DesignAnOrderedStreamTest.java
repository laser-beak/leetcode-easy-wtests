package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DesignAnOrderedStreamTest {

    @Test
    void first_test() {
        DesignAnOrderedStream designAnOrderedStream = new DesignAnOrderedStream(5);

        designAnOrderedStream.insert(3, "ccccc"); // Inserts (3, "ccccc"), returns [].
        assertArrayEquals(new String[]{null, null, "ccccc", null, null}, designAnOrderedStream.getValues());

        designAnOrderedStream.insert(1, "aaaaa"); // Inserts (1, "aaaaa"), returns ["aaaaa"].
        assertArrayEquals(new String[]{"aaaaa", null, "ccccc", null, null}, designAnOrderedStream.getValues());

        designAnOrderedStream.insert(2, "bbbbb"); // Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
        assertArrayEquals(new String[]{"aaaaa", "bbbbb", "ccccc", null, null}, designAnOrderedStream.getValues());

        designAnOrderedStream.insert(5, "eeeee"); // Inserts (5, "eeeee"), returns [].
        assertArrayEquals(new String[]{"aaaaa", "bbbbb", "ccccc", null, "eeeee"}, designAnOrderedStream.getValues());

        designAnOrderedStream.insert(4, "ddddd"); // Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].
        assertArrayEquals(new String[]{"aaaaa", "bbbbb", "ccccc", "ddddd", "eeeee"}, designAnOrderedStream.getValues());
    }
}