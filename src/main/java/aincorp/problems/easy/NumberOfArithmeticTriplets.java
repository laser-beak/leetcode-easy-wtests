package aincorp.problems.easy;

public class NumberOfArithmeticTriplets {

    public int arithmeticTriplets(int[] nums, int diff) {

        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((nums[j] - nums[i] == diff) && (nums[k] - nums[j] == diff)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    /* List<Integer> arrayList = new ArrayList<>();

        for (int n : nums) {
            arrayList.add(n);
        }

        for (int arr: arrayList) {
            if (arrayList.contains(arr + diff)&&(arrayList.contains(arr+2*diff))) {
                count++;
            }
        }*/

        /*Set<Integer> set = new HashSet<>();
        for(int a : nums)
            set.add(a);

        for(int a : nums)
        {
            if(set.contains(a-diff) && set.contains(a+diff))
                count++;
        }*/
}
