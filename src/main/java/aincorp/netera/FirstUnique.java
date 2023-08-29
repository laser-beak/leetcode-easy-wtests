package aincorp.netera;

public class FirstUnique {

   /* public static int firstUnique(String s) {
        Set<Character> notUniqueChars = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    flag = false;
                    notUniqueChars.add(s.charAt(i));
                    break;
                }
            }

            if (flag && !notUniqueChars.contains(s.charAt(i))) {
                return i;
            }
        }

        return -1;
    }*/

    public static int firstUnique(String s) {
        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }

        for (int j = 0; j < s.length(); j++) {
            if (counts[s.charAt(j) - 'a'] == 1) {
                return j;
            }
        }

        return -1;
    }
}
