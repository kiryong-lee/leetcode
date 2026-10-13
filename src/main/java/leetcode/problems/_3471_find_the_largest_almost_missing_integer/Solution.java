package leetcode.problems._3471_find_the_largest_almost_missing_integer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {

    public int largestInteger(int[] nums, int k) {

        Map<Integer, Integer> numCountMap = new HashMap<>();
        for (int i = 0; i < nums.length - k + 1; i++) {
            Set<Integer> used = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                if (used.add(nums[j])) {
                    numCountMap.put(nums[j], numCountMap.getOrDefault(nums[j], 0) + 1);
                }
            }
        }

        int maxValue = -1;
        for (Map.Entry<Integer, Integer> entry : numCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                maxValue = Math.max(maxValue, entry.getKey());
            }
        }

        return maxValue;
    }
}
