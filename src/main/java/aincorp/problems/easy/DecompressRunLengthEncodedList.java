package aincorp.problems.easy;

public class DecompressRunLengthEncodedList {

    public int[] decompressRLElist(int[] nums) {
        int resultSize = 0;

        for (int i = 0; i < nums.length; i+=2) {
            resultSize += nums[i];
        }

        int[] resultArray = new int[resultSize];

        int index = 0;
        int globalIndex = 0;
        while(index < nums.length) {
            for (int j = 0; j < nums[index]; j++) {
                 resultArray[globalIndex++] = nums[index + 1];
            }
            index +=2;
        }

        return resultArray;
    }
}
