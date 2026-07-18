package leetcode.problems._1979_find_greatest_common_divisor_of_array;

class Solution {

    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        while (max % min != 0) {
            int remainder = max % min;
            max = min;
            min = remainder;
        }

        return min;
    }
}
