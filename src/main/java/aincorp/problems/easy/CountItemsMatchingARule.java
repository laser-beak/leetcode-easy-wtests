package aincorp.problems.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountItemsMatchingARule {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;

        Map<String, Integer> map = new HashMap<>();
        map.put("type", 0);
        map.put("color", 1);
        map.put("name", 2);

        for (List<String> list : items) {
            if (list.get(map.get(ruleKey)).equals(ruleValue)) {
                ans++;
            }
        }

        return ans;
    }
}
