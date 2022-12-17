package aincorp.yamock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RLETest {

    private final RLE rle = new RLE();

    @Test
    public void test() {
        assertEquals("", rle.rle(""));
        assertEquals("", rle.rle("   "));
        assertEquals("", rle.rle(null));
        assertEquals("A4", rle.rle("AAAA"));
        assertEquals("A4B3", rle.rle("AAAABBB"));
        assertEquals("AB2C3D4E", rle.rle("ABBCCCDDDDE"));
    }

}