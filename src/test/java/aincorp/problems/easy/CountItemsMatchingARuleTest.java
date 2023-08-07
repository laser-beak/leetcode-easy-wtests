package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountItemsMatchingARuleTest {

    private final CountItemsMatchingARule countItemsMatchingARule = new CountItemsMatchingARule();

    @Test
    void first_test() {
        List<List<String>> lists = new ArrayList<>();
        lists.add(new ArrayList<>(Arrays.asList("phone", "blue", "pixel")));
        lists.add(new ArrayList<>(Arrays.asList("computer", "silver", "lenovo")));
        lists.add(new ArrayList<>(Arrays.asList("phone", "gold", "iphone")));

        assertEquals(1, countItemsMatchingARule.countMatches(lists, "color", "silver"));
    }

    @Test
    void second_test() {
        List<List<String>> lists = new ArrayList<>();
        lists.add(new ArrayList<>(Arrays.asList("phone", "blue", "pixel")));
        lists.add(new ArrayList<>(Arrays.asList("computer", "silver", "phone")));
        lists.add(new ArrayList<>(Arrays.asList("phone", "gold", "iphone")));

        assertEquals(2, countItemsMatchingARule.countMatches(lists, "type", "phone"));
    }
}