package aincorp.problems.easy;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class SortThePeople {

    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> integerStringMap = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < names.length; i++) {
            integerStringMap.put(heights[i], names[i]);
        }

        return integerStringMap.values().toArray(new String[integerStringMap.values().size()]);
    }
}
