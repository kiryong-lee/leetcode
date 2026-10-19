package leetcode.problems._2089_find_target_indices_after_sorting_array;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Integer> targetIndices(int[] nums, int target) {
        int lowerCount = 0;
        int sameCount = 0;
        for (int num : nums) {
            if (num == target) {
                sameCount++;
            } else if (num < target) {
                lowerCount++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < sameCount; i++) {
            result.add(lowerCount + i);
        }

        return result;
    }
}
