package leetcode.problems._3741_minimum_distance_between_three_equal_elements_ii;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public int minimumDistance(int[] nums) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], key -> new ArrayList<>()).add(i);
        }

        int minSpan = Integer.MAX_VALUE;
        for (List<Integer> list : map.values()) {
            if (list.size() < 3) {
                continue;
            }

            for (int i = 2; i < list.size(); i++) {
                int value = list.get(i) - list.get(i - 2);
                minSpan = Math.min(minSpan, value);
            }
        }

        return minSpan == Integer.MAX_VALUE ? -1 : minSpan * 2;
    }
}
