package aincorp.problems.easy;

public class FindTheHighestAltitude {

    public int largestAltitude(int[] gain) {
        int highestAttitude = 0;

        int sum = 0;

        for (int g: gain) {
            sum += g;
            if (sum > highestAttitude) {
                highestAttitude = sum;
            }
        }

        return highestAttitude;
    }
}
