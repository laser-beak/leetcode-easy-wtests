package aincorp.problems.easy;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
class ImplementStrStrTest {
    private final ImplementStrStr implementStrStr = new ImplementStrStr();

    @Test
    public void needle_is_empty() {
        assertEquals(0, implementStrStr.strStr("", ""));
    }

    @Test
    public void needle_is_contains_index_on_str() {
        assertEquals(2, implementStrStr.strStr("hello", "ll"));
    }
}