package leetcode.problems._0448_find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] flag = new boolean[nums.length + 1];
        for (int num : nums) {
            flag[num] = true;
        }
        List<Integer> output = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!flag[i]) {
                output.add(i);
            }
        }

        return output;
    }
}
