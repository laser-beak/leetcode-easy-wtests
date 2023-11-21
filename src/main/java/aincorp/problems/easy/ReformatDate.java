package aincorp.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {

    public String reformatDate(String date) {
        Map<String, String> month = new HashMap<>();
        month.put("Jan", "01");
        month.put("Feb", "02");
        month.put("Mar", "03");
        month.put("Apr", "04");
        month.put("May", "05");
        month.put("Jun", "06");
        month.put("Jul", "07");
        month.put("Aug", "08");
        month.put("Sep", "09");
        month.put("Oct", "10");
        month.put("Nov", "11");
        month.put("Dec", "12");
        String[] splitDate = date.split(" ");
        StringBuilder sb = new StringBuilder();
        String strOfDay = splitDate[0].substring(0, splitDate[0].length() - 2);
        sb.append(splitDate[2])
                .append("-")
                .append(month.get(splitDate[1]))
                .append("-")
                .append(strOfDay.length() == 1 ? "0" + strOfDay : strOfDay);
        return sb.toString();
    }
}