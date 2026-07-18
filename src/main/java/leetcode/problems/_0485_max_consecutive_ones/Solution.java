package leetcode.problems._0485_max_consecutive_ones;

class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int consecutive = 0;
        for (int num : nums) {
            if (num == 1) {
                consecutive++;
            } else {
                max = Math.max(max, consecutive);
                consecutive = 0;
            }
        }
        max = Math.max(max, consecutive);

        return max;
    }
}
