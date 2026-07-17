package leetcode.problems._1672_richest_customer_wealth;

import java.util.Arrays;

class Solution {

    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        for (int[] account : accounts) {
            richest = Math.max(richest, Arrays.stream(account).sum());
        }
        return richest;
    }
}
