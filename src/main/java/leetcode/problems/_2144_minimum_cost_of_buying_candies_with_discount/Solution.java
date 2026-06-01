package leetcode.problems._2144_minimum_cost_of_buying_candies_with_discount;

import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {

        Arrays.sort(cost);
        reverse(cost);
        int sum = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            if (i % 3 == 2) {
                continue;
            }
            sum += cost[i];
        }
        return sum;
    }

    private void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
