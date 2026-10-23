package leetcode.problems._2778_sum_of_squares_of_special_elements;

class Solution {

    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int squareSum = 0;
        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                squareSum += nums[i] * nums[i];
            }
        }

        return squareSum;
    }
}
