package leetcode_challenge.easy;

import java.util.Arrays;

public class _1_Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 5};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;

                    return output;
                }
            }
        }

        return output;
    }
}
