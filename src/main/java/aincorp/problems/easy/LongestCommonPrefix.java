package aincorp.problems.easy;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String longestCommonPrefix = "";

        if (strs.length == 1) {
            longestCommonPrefix = strs[0];
        }

        int minLength = strs[0].length();
        int index = 0;
        for (int i = 1; i < strs.length; i++) {
            if (minLength > strs[i].length()) {
                minLength = strs[i].length();
                index = i;
            }
        }
        String str = strs[index];

        int i = 1;

        while (i <= str.length()) {
            String sub = str.substring(0, i);
            boolean flag = false;
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].substring(0, i).equals(sub)) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                longestCommonPrefix = sub;
            }
            i++;
        }

        return longestCommonPrefix;

        /*if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;*/
    }
}
