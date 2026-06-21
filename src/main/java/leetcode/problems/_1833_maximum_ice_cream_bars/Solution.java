package leetcode.problems._1833_maximum_ice_cream_bars;


import java.util.Arrays;

class Solution {

    public int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);
        int count = 0;
        for (int cost : costs) {
            if (coins - cost >= 0) {
                count++;
                coins -= cost;
            }
        }

        return count;
    }
}
