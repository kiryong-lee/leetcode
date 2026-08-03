package leetcode.problems._1475_final_prices_with_a_special_discount_in_a_shop;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    public int[] finalPrices(int[] prices) {
        int[] output = prices.clone();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int top = stack.pop();
                output[top] -= prices[i];
            }
            stack.push(i);
        }

        return output;
    }

}
