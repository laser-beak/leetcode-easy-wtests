package aincorp.yamock.competition;

import java.io.BufferedReader;
import java.io.FileReader;

public class JewelsAndStones {

    public static void main(String[] args) {
        BufferedReader bufferedReader;

        try {
            bufferedReader = new BufferedReader(new FileReader("src/main/java/aincorp/yamock/competition/input.txt"));
            String line = bufferedReader.readLine();

            char[] chars = line.toCharArray();

            int count = 0;

            while (line != null) {
                line = bufferedReader.readLine();
                if (line != null) {
                    for (int i = 0; i < line.length(); i++) {
                        if (line.charAt(i) == chars[0] || line.charAt(i) == chars[1]) {
                            count++;
                        }
                    }
                }
            }

            System.out.println(count);

            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
