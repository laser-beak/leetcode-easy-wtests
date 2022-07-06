package aincorp.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class DesignAnOrderedStream {

    private int n = 0;

    private final String[] values;

    public DesignAnOrderedStream(int n) {
        values = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        List<String> output = new ArrayList<>();
        values[idKey - 1] = value;

        while (n < values.length && values[n] != null) {
            output.add(values[n++]);
        }
        return output;
    }

    public String[] getValues() {
        return values;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
