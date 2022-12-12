package aincorp.problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();

        if (numRows == 1) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(Arrays.asList(1));
            return list;
        }

        if (numRows == 2) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(Arrays.asList(1));
            list.add(Arrays.asList(1,1));
            return list;
        }

        resultList.add(Arrays.asList(1));
        resultList.add(Arrays.asList(1, 1));

        List<Integer> list = Arrays.asList(1, 2, 1);
        resultList.add(list);

        for (int i = 2; i < numRows - 1; i++) {
            List<Integer> lRes = new ArrayList<>();
            lRes.add(1);
            for (int j = 0; j < list.size() - 1; j++) {
                lRes.add(list.get(j) + list.get(j + 1));
            }
            lRes.add(1);
            resultList.add(lRes);
            list = lRes;
        }

        return resultList;
    }
}
