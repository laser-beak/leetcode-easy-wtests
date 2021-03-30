package aincorp.problems.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateTargetArrayInTheGivenOrderTest {

    CreateTargetArrayInTheGivenOrder createTargetArrayInTheGivenOrder;

    @DisplayName("CreateTargetArrayInTheGivenOrder.createTargetArray")
    @Test
    void createTargetArray() {
        createTargetArrayInTheGivenOrder = new CreateTargetArrayInTheGivenOrder();
        assertArrayEquals(new int[]{0, 4, 1, 3, 2}, createTargetArrayInTheGivenOrder.createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1}));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, createTargetArrayInTheGivenOrder.createTargetArray(new int[]{1, 2, 3, 4, 0}, new int[]{0, 1, 2, 3, 0}));
        assertArrayEquals(new int[]{1}, createTargetArrayInTheGivenOrder.createTargetArray(new int[]{1}, new int[]{0}));
    }
}