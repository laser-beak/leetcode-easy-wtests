package aincorp.yamock.competition;

import java.util.List;

public class LongestOnesSequence {

    public int longestOnesSequence(List<Integer> numbers) {
        int max = 0;

        int count = 0;
        for (Integer num : numbers) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            if (max < count) {
                max = count;
            }
        }

        return max;
    }
}
