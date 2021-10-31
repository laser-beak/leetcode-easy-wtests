package aincorp.problems.easy;

public class MoveZeroes {

    public int[] moveZeroes(int[] nums) {

        if (nums.length == 1) {
            return nums;
        }

        int p1 = 0;
        int p2 = nums.length;

        while (p1 < p2) {

            int previous;

            if (nums[p1] == 0) {
                previous = nums[p1];

                for (int j = p1; j < p2 - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[p2 - 1] = previous;
                p2--;
            } else {
                p1++;
            }
        }

        return nums;
    }
}
