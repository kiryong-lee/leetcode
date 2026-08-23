package leetcode.problems._3622_check_divisibility_by_digit_sum_and_product;

class Solution {

    public boolean checkDivisibility(int n) {
        int remaining = n;
        int sum = 0;
        int product = 1;
        while (remaining > 0) {
            int digit = remaining % 10;
            sum += digit;
            product *= digit;
            remaining /= 10;
        }
        return n % (sum + product) == 0;
    }
}
