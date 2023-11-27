package aincorp.problems.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SplitStringsBySeparatorTest {

    SplitStringsBySeparator splitStringsBySeparator = new SplitStringsBySeparator();

    @Test
    void test() {
        assertEquals(new ArrayList<>(
                Arrays.asList("one","two","three","four","five","six")),
                splitStringsBySeparator.splitWordsBySeparator(new ArrayList<>(
                        Arrays.asList("one.two.three","four.five","six")), '.'));
        assertEquals(new ArrayList<>(
                        Arrays.asList("easy","problem")),
                splitStringsBySeparator.splitWordsBySeparator(new ArrayList<>(
                        Arrays.asList("$easy$","$problem$")), '$'));
    }

}