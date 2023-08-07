package aincorp.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class XOfaKindInaDeckOfCards {

    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> countsMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> m : countsMap.entrySet()) {
            if (m.getValue() % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
