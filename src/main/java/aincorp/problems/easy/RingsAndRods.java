package aincorp.problems.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RingsAndRods {

    public int countPoints(String rings) {
        int number = 0;

        char[] chars = rings.toCharArray();

        Map<Character, Set<Character>> map = new HashMap<>();

        for (int i = 1; i < chars.length; i += 2) {
            if (map.containsKey(chars[i])) {
                map.get(chars[i]).add(chars[i - 1]);
            } else {
                Set<Character> hashSet = new HashSet<>();
                hashSet.add(chars[i - 1]);
                map.put(chars[i], hashSet);
            }
        }

        for (Character character : map.keySet()) {
            if (map.get(character).size() == 3) {
                number++;
            }
        }

        return number;
    }
}
