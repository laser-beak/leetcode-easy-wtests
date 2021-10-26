package aincorp.problems.easy;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int newNumsLength = 0;

        for (int i = 0; i < nums.length; i++) {

            int index = 0;
            for (int j = nums.length -1; j > 0; j--) {
                if (nums[j] != val) {
                    index = j;
                    break;
                }
            }

            if (i == index ) {
                break;
            }

            if (nums[i] == val) {
                int swap = nums[i];
                nums[i] = nums[index];
                nums[index] = swap;
            }

            if (nums.length == 2) {
                break;
            }
        }

        int ii = 0;
        while (ii < nums.length) {
            if (nums[ii] != val) {
                newNumsLength++;
            }
            ii++;
        }

        return newNumsLength;
    }
}
