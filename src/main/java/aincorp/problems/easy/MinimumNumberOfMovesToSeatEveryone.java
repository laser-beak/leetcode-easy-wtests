package aincorp.problems.easy;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {

    public int minMovesToSeat(int[] seats, int[] students) {
        int ans = 0;

        Arrays.sort(seats);
        Arrays.sort(students);

        for (int i = 0; i < seats.length; i++) {
            if (students[i] <= seats[i]) {
                ans += seats[i] - students[i];
            } else {
                ans += students[i] - seats[i];
            }
        }

        return ans;
    }

}
