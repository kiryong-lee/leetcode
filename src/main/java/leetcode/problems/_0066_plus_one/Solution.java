package leetcode.problems._0066_plus_one;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    public int[] plusOne(int[] digits) {
        Deque<Integer> output = new ArrayDeque<>();
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + carry == 10) {
                output.addFirst(0);
                carry = 1;
            } else {
                output.addFirst(digits[i] + carry);
                carry = 0;
            }
        }

        if (carry == 1) {
            output.addFirst(1);
        }

        return toArray(output);
    }

    private int[] toArray(Deque<Integer> numbers) {
        int[] result = new int[numbers.size()];
        int index = 0;

        for (int number : numbers) {
            result[index] = number;
            index++;
        }

        return result;
    }
}
