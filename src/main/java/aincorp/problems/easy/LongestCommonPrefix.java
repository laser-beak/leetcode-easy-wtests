package aincorp.problems.easy;

import java.util.Set;
import java.util.TreeSet;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = "";

        if (strs.length > 0) {

            if (strs.length == 1) {
                return strs[0];
            }

            if (strs.length == 2) {
                if (strs[0].length() >= strs[1].length()) {
                    if (strs[0].contains(strs[1])) {
                        return strs[1];
                    }
                } else {
                    if (strs[1].contains(strs[0])) {
                        return strs[0];
                    }
                }
            }

            Set<String> prefixes = new TreeSet<>();

            int j = 0;
            for (int i = 1; i <= strs[0].length(); i++) {
                prefixes.add(strs[0].substring(j, i));
            }


            for (String str : prefixes) {
                boolean flag = false;
                for (String s : strs) {
                    if (s.contains(str) && s.length() > 1) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    longestCommonPrefix = str;
                }
            }
        }

        return longestCommonPrefix;
    }
}
