package leetcode.problems._2574_left_and_right_sum_differences;

class Solution {

    public int[] leftRightDifference(int[] nums) {

        int[] leftSums = new int[nums.length];
        int[] rightSums = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            leftSums[i] = leftSums[i - 1] + nums[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            rightSums[i] = rightSums[i + 1] - nums[i + 1];
        }

        int[] newSums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newSums[i] = Math.abs(leftSums[i] + rightSums[i]);
        }

        return newSums;
    }
}
