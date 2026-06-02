package leetcode.problems._3300_minimum_element_after_replacement_with_digit_sum;

class Solution {
    public int minElement(int[] nums) {

        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            min = Math.min(min, sum);
        }

        return min;
    }
}
