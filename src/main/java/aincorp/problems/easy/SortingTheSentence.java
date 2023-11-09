package aincorp.problems.easy;

public class SortingTheSentence {
    public String sortSentence(String s) {
        StringBuilder sortedString = new StringBuilder();

        String[] splitStrings = s.split("\\s+");
        String[] sortStrings = new String[splitStrings.length];

        for (int i = 0; i < splitStrings.length; i++) {
            char stringLastChar = splitStrings[i].charAt(splitStrings[i].length() - 1);
            sortStrings[Character.getNumericValue(stringLastChar) - 1] = splitStrings[i].substring(0, splitStrings[i].length() - 1);
        }

        for (int j = 0; j < sortStrings.length; j++) {
            sortedString.append(sortStrings[j]);
            sortedString.append(" ");
        }

        return sortedString.toString().trim();
    }
}
