package aincorp.algoexpert;

import java.util.List;

public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        int index = 0;

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals(sequence.get(index))) {
                index++;
            }

            if (index == sequence.size()) {
                return true;
            }
        }

        return false;
    }
}
