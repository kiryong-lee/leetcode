package leetcode.problems._2913_subarrays_distinct_element_sum_of_squares_i;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int squareSum = 0;
        for (int i = 0; i < n; i++) {
            Set<Integer> numSet = new HashSet<>();
            for (int j = i; j < n; j++) {
                numSet.add(nums.get(j));
                squareSum += (numSet.size() * numSet.size());
            }
        }

        return squareSum;
    }
}
