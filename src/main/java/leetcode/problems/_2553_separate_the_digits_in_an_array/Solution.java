package leetcode.problems._2553_separate_the_digits_in_an_array;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {

    public int[] separateDigits(int[] nums) {

        List<Integer> answer = new ArrayList<>();
        for (int num : nums) {
            Deque<Integer> separated = new ArrayDeque<>();
            while (num > 0) {
                separated.addFirst(num % 10);
                num /= 10;
            }
            answer.addAll(separated);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
