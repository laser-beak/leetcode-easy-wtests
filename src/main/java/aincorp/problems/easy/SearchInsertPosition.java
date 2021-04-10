package aincorp.problems.easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int targetIndex = 0;

        int numsLength = nums.length;

        int leftEdge = 0;
        int rightEdge = numsLength - 1;

        while (leftEdge <= rightEdge) {
            int middle = (leftEdge + rightEdge) / 2;

            if (nums[middle] == target) {
                targetIndex = middle;
                break;
            }

            if (nums[middle] < target) {
                leftEdge = middle + 1;
            } else {
                rightEdge = middle - 1;
            }

            targetIndex = middle;
        }

        if (nums[targetIndex] < target) {
            targetIndex++;
        }

        return targetIndex;
    }
}
