package aincorp.problems.easy;

public class XOROperationInAnArray {

    public int xorOperation(int n, int start) {
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = start + 2 * i;
        }

        int result = nums[0];
        for (int j = 1; j < nums.length; j++) {
            result = result ^ nums[j];
        }

        return result;
    }
}
