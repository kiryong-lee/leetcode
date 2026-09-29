package leetcode.problems._1331_rank_transform_of_an_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public int[] arrayRankTransform(int[] arr) {

        int[] newArr = new int[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        Arrays.sort(newArr);
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : newArr) {
            if (!map.containsKey(value)) {
                map.put(value, map.size() + 1);
            }
        }
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = map.get(arr[i]);
        }

        return answer;
    }
}
