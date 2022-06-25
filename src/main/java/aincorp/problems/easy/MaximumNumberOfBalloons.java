package aincorp.problems.easy;

import java.util.Map;
import java.util.TreeMap;

public class MaximumNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new TreeMap<>();

        char[] chars = text.toCharArray();

        String balloon = "balloon";
        char[] balloonChars = balloon.toCharArray();

        for (char ch : balloonChars) {
            map.put(ch, 0);
        }

        for (char b : chars) {
            if (map.containsKey(b)) {
                map.put(b, map.get(b) + 1);
            }
        }

        int min = (int) map.values().toArray()[0];

        for (Integer integer : map.values()) {
            if (min > integer) {
                min = integer;
            }
        }

        if (map.get('o') / 2 <= min) {
            min = map.get('o') / 2;
        } else {

        }

        return min;
    }
}
