package leetcode.problems._3731_find_missing_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> output = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            for (int missing = nums[i - 1] + 1; missing < nums[i]; missing++) {
                output.add(missing);
            }
        }

        return output;
    }
}
