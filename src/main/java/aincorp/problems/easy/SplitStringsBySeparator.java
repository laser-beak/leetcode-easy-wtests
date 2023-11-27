package aincorp.problems.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class SplitStringsBySeparator {

    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> strings = new ArrayList<>();

        for (String word: words) {
            String[] separated = word.split(Pattern.quote(String.valueOf(separator)));
            for (String sep: separated) {
                if (!sep.isEmpty()) {
                    strings.add(sep);
                }
            }
        }
        return strings;
    }
}
