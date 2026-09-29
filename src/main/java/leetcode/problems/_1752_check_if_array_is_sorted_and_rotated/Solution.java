package leetcode.problems._1752_check_if_array_is_sorted_and_rotated;

class Solution {

    public boolean check(int[] nums) {

        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
