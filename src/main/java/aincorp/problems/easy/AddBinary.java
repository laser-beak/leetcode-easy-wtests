package aincorp.problems.easy;

public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();

        for (int i = a.length() - 1; i > 0; i--) {
            for (int j = b.length() - 1; j > 0; j--) {
                int first = Integer.parseInt(String.valueOf(a.charAt(i)));
                int second = Integer.parseInt(String.valueOf(b.charAt(j)));

            }
        }

        return builder.reverse().toString();
    }
}

