package leetcode.problems._2784_check_if_array_is_good;

import java.util.Arrays;

class Solution {

    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        if (nums.length != nums[nums.length - 1] + 1) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (i + 1 != nums[i]) {
                return false;
            }
        }
        return true;
    }
}
