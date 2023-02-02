package aincorp.problems.easy;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {

    public boolean canBeIncreasing(int[] nums) {
        for(int i = 0, faults = 0; i < nums.length - 1; i++) {
            if(nums[i] >= nums[i + 1]) {
                faults++;
                if(faults == 2) {
                    return false;
                }
                if (i != 0 && nums[i - 1] >= nums[i + 1]) {
                    nums[i + 1] = nums[i];
                }
            }
        }
        return true;
    }
}
