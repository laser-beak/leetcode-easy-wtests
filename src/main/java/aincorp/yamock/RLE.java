package aincorp.yamock;

public class RLE {

    public String rle(String word) {
        if (word == null || word.isEmpty() || word.isBlank()) {
            return "";
        }

        StringBuilder resStr = new StringBuilder();

        int i = 0;
        int count = 0;

        while (i < word.length()) {
            char symbol = word.charAt(i);
            int j = i;
            while (j < word.length()) {
                if (word.charAt(j) == symbol) {
                    count++;
                } else {
                    break;
                }
                j++;
            }
            if (count == 1) {
                resStr.append(symbol);
            } else {
                resStr.append(symbol).append(count);
            }
            count = 0;
            i = j;
        }

        return resStr.toString();
    }
}
