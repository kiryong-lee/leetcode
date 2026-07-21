package leetcode.problems._0645_set_mismatch;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= nums.length; i++) {
            set.add(i);
        }

        int[] output = new int[2];
        for (int num : nums) {
            if (!set.remove(num)) {
                output[0] = num;
            }
        }
        output[1] = set.iterator().next();

        return output;
    }
}
