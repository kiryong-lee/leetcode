package leetcode.problems._3754_concatenate_non_zero_digits_and_multiply_by_sum_i;

class Solution {

    public long sumAndMultiply(int n) {

        int sum = 0;
        long x = 0;
        for (char c : String.valueOf(n).toCharArray()) {
            if (c == '0') {
                continue;
            }

            int digit = c - '0';
            x = x * 10 + digit;
            sum += digit;
        }

        return x * sum;
    }
}
