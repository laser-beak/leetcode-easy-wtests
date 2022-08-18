package aincorp.problems.easy;

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean b = !s.substring(i + 1).contains(s.substring(i, i + 1));
            boolean b1 = !s.substring(0, i).contains(s.substring(i, i + 1));
            if (b && b1) {
                return i;
            }
        }

        return -1;
    }
}
