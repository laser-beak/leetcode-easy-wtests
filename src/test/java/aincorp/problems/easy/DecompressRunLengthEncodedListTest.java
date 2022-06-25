package aincorp.problems.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DecompressRunLengthEncodedListTest {
    private final DecompressRunLengthEncodedList decompressRunLengthEncodedList = new DecompressRunLengthEncodedList();

    @DisplayName("DecompressRunLengthEncodedList.decompressRLElist")
    @Test
    void decompressRLElist() {
        assertArrayEquals(new int[]{1, 3, 3}, decompressRunLengthEncodedList.decompressRLElist(new int[]{1, 1, 2, 3}));
    }
}