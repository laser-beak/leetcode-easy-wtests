package aincorp.problems.easy;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        /*Arrays.sort(nums);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty() || nums[i] != stack.peek()) {
                stack.add(nums[i]);
            } else {
                stack.pop();
            }
        }

        return stack.pop();*/

        /*Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;*/

        int res = 0;

        for (int n : nums) {
            res = res ^ n;
        }

        return res;
    }
}
