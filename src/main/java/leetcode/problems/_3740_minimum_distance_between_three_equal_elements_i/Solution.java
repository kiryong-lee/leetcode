package leetcode.problems._3740_minimum_distance_between_three_equal_elements_i;

class Solution {

    public int minimumDistance(int[] nums) {
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] == nums[k]) {
                            minDistance = Math.min(minDistance, 2 * (k - i));
                        }
                    }
                }
            }
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}
