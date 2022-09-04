package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementTest {

    private final MajorityElement element = new MajorityElement();

    @Test
    public void test() {
        assertEquals(3, element.majorityElement(new int[]{3, 2, 3}));
        assertEquals(2, element.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        assertEquals(3, element.majorityElement(new int[]{3, 3, 4}));
    }

}