package aincorp.problems.easy;

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            boolean b1 = false;
            boolean b2 = false;

            for (int j = 0; j < i; j++) {
                if (chars[i] == chars[j]) {
                    b1 = true;
                    break;
                }
            }

            for (int k = i + 1; k < chars.length; k++) {
                if (chars[i] == chars[k]) {
                    b2 = true;
                    break;
                }
            }

            if (b2 == false && b1 == false) {
                return i;
            }
        }

        return -1;
    }
}
