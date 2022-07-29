package aincorp.problems.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWords {

    public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> morseMap = new HashMap<>();

        String[] morseAlphabet = new String[]{
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        int index = 0;

        for (char c = 'a'; c <= 'z'; ++c) {
            morseMap.put(c, morseAlphabet[index]);
            index++;
        }

        Set<String> morseSet = new HashSet<>();

        for (String word : words) {
            char[] chars = word.toCharArray();

            StringBuilder sb = new StringBuilder();

            for (char c : chars) {
                sb.append(morseMap.get(c));
            }

            morseSet.add(sb.toString());
        }

        return morseSet.size();
    }
}
