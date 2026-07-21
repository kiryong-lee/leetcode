package leetcode.problems._1365_how_many_numbers_are_smaller_than_the_current_number;

class Solution {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] numCount = new int[101];
        for (int num : nums) {
            numCount[num]++;
        }
        int[] cumSum = new int[101];
        for (int i = 1; i < cumSum.length; i++) {
            cumSum[i] = cumSum[i - 1] + numCount[i - 1];
        }

        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = cumSum[nums[i]];
        }

        return output;
    }
}
