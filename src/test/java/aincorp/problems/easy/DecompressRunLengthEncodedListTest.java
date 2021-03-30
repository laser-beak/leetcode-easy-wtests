package aincorp.problems.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecompressRunLengthEncodedListTest {

    DecompressRunLengthEncodedList decompressRunLengthEncodedList;

    @DisplayName("DecompressRunLengthEncodedList.decompressRLElist")
    @Test
    void decompressRLElist() {
        decompressRunLengthEncodedList = new DecompressRunLengthEncodedList();
        assertArrayEquals(new int[]{1,3,3}, decompressRunLengthEncodedList.decompressRLElist(new int[]{1,1,2,3}));
    }
}