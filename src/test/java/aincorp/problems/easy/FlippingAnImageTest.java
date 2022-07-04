package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FlippingAnImageTest {

    private final FlippingAnImage flippingAnImage = new FlippingAnImage();

    @Test
    public void test() {
        assertArrayEquals(new int[][]{{1, 0, 0}, {0, 1, 0}, {1, 1, 1}}, flippingAnImage.flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}}));
        assertArrayEquals(new int[][]{{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}}, flippingAnImage.flipAndInvertImage(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}}));
    }

}