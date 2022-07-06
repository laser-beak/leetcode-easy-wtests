package aincorp.problems.easy;

public class CheckIfTwoStringArraysAreEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return concat(word1).equals(concat(word2));
    }

    private String concat(String[] word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : word) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
