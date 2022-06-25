package aincorp.problems.easy;

public class MoveZeroes {
    public int[] moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int index = i;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        index = j;
                        break;
                    }
                }
                int swap = nums[index];
                nums[index] = nums[i];
                nums[i] = swap;
            }
        }
        return nums;
    }
}
