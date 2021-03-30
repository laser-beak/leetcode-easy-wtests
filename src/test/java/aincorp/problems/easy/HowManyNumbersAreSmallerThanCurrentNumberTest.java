package aincorp.problems.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HowManyNumbersAreSmallerThanCurrentNumberTest {

    HowManyNumbersAreSmallerThanCurrentNumber howManyNumbersAreSmallerThanCurrentNumber;

    @DisplayName("HowManyNumbersAreSmallerThanCurrentNumber.smallerNumberThanCurrent")
    @Test
    void smallerNumbersThanCurrent() {
        howManyNumbersAreSmallerThanCurrentNumber = new HowManyNumbersAreSmallerThanCurrentNumber();

        assertArrayEquals(new int[]{2,1,0,3}, howManyNumbersAreSmallerThanCurrentNumber.smallerNumbersThanCurrent(new int[]{6,5,4,8}));
    }
}