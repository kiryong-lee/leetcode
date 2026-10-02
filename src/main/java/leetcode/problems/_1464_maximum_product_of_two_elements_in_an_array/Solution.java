package leetcode.problems._1464_maximum_product_of_two_elements_in_an_array;

import java.util.Arrays;

class Solution {

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return (nums[n - 1] - 1) * (nums[n - 2] - 1);
    }
}
