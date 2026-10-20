package leetcode.problems._3550_smallest_index_with_digit_sum_equal_to_index;

class Solution {

    public int smallestIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int digitSum = getSumOfDigits(nums[i]);
            if (i == digitSum) {
                return i;
            }
        }

        return -1;
    }

    private int getSumOfDigits(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}
