package leetcode.problems._2615_sum_of_distances;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    private final Map<Integer, List<Integer>> map = new HashMap<>();

    public long[] distance(int[] nums) {
        long[] output = new long[nums.length];
        Arrays.fill(output, -1);

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
            } else {
                map.put(nums[i], new ArrayList<>());
                map.get(nums[i]).add(i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (output[i] != -1) {
                continue;
            }
            List<Integer> samePositions = map.get(nums[i]);
            if (samePositions.size() == 1) {
                output[i] = 0;
            } else {
                setOutput(samePositions, output);
            }
        }
        return output;
    }

    private void setOutput(List<Integer> samePositions, long[] output) {

        int n = samePositions.size();
        long[] prefixSum = new long[n];
        prefixSum[0] = samePositions.get(0);
        for (int i = 1; i < n; i++) {
            prefixSum[i] = samePositions.get(i) + prefixSum[i - 1];
        }

        for (int i = 0; i < n; i++) {
            int current = samePositions.get(i);
            long sum = (long) current * i;
            if (i > 0) {
                sum -= prefixSum[i - 1];
            }
            sum += (prefixSum[n - 1] - prefixSum[i]) - (long) current * (n - 1 - i);
            output[current] = sum;
        }
    }
}