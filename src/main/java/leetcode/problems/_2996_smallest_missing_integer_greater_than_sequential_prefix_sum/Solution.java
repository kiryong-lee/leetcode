package leetcode.problems._2996_smallest_missing_integer_greater_than_sequential_prefix_sum;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int missingInteger(int[] nums) {
        int prefixSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                break;
            }
            prefixSum += nums[i];
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int candidate = prefixSum;
        while (set.contains(candidate)) {
            candidate++;
        }
        return candidate;
    }
}
