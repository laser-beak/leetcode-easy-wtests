package aincorp.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage {

    public String decodeMessage(String key, String message) {
        Map<Character, Character> substitutionMap = new HashMap<>();
        substitutionMap.put(' ', ' ');

        char[] keyChars = key.toCharArray();

        char c = 'a';

        for (Character character : keyChars) {
            if (!substitutionMap.containsKey(character)) {
                substitutionMap.put(character, c++);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        char[] mesChars = message.toCharArray();

        for (Character character : mesChars) {
            stringBuilder.append(substitutionMap.get(character));
        }

        return stringBuilder.toString();
    }
}
