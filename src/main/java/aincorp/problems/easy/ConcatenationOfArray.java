package aincorp.problems.easy;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int length = nums.length * 2;

        int[] ans = new int[length];

        int nl = nums.length;

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nl] = nums[i];
        }

        return ans;
    }

    //System.arraycopy(nums, 0, ans, 0, n);
    //System.arraycopy(nums, 0, ans, n, m);
    //work faster
}
