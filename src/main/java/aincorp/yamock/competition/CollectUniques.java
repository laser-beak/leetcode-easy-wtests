package aincorp.yamock.competition;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectUniques {

    public List<Integer> uniques(List<Integer> numbers) {
        Set<Integer> unique = new HashSet<>();
        unique.addAll(numbers);
        return new ArrayList<>(unique);
    }
}
