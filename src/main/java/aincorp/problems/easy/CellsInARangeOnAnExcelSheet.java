package aincorp.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet {

    public List<String> cellsInRange(String s) {
        List<String> stringList = new ArrayList<>();

        for (char c = s.charAt(0); c <= s.charAt(3); c++) {
            for (char i = s.charAt(1); i <= s.charAt(4); i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(c).append(i);
                stringList.add(sb.toString());
            }
        }

        return stringList;
    }
}
