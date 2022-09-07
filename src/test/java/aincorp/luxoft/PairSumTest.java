package aincorp.luxoft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairSumTest {

    private PairSum pairSum = new PairSum();

    @Test
    public void test() {
        assertEquals(0, pairSum.solution(new int[]{}));
        assertEquals(2, pairSum.solution(new int[]{-1, 7, -9, -7, 1, 8}));
        assertEquals(0, pairSum.solution(new int[]{-1, -7, -9, -7, -1, -8}));
        assertEquals(1, pairSum.solution(new int[]{-1, 1}));
    }

}