package aincorp.problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateTheDigitsInAnArray {

    public int[] separateDigits(int[] nums) {

        List<Integer> integerList = new ArrayList<>();

        for (int i : nums) {
            if (i / 10 != 0) {
                while (i > 0) {
                    integerList.add(i / 10);
                    i %= 10;
                    i *= 10;
                }
            } else {
                integerList.add(i);
            }
        }

        int[] res = new int[integerList.size()];
        Arrays.setAll(res, integerList::get);

        return res;
    }
}
