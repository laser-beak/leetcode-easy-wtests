package aincorp.problems.easy;

import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@Disabled
class FindCommonCharactersTest {

    private FindCommonCharacters findCommonCharacters = new FindCommonCharacters();

    @Ignore
    @Test
    void test() {
        List<String> result = new ArrayList<>(Arrays.asList("e", "l", "l"));
        assertEquals(result, findCommonCharacters.commonChars(new String[]{"bella", "label", "roller"}));
        List<String> result1 = new ArrayList<>(Arrays.asList("c", "o"));
        assertEquals(result1, findCommonCharacters.commonChars(new String[]{"cool", "lock", "cook"}));
    }
}