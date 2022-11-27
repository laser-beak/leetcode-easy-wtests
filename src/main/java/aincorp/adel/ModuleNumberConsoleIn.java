package aincorp.adel;

import java.util.Scanner;

public class ModuleNumberConsoleIn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int max = 0;

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num == 0) {
                    break;
                }

                if (max < num) {
                    max = num;
                    count = 1;
                } else if (max == num) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
