package leetcode.problems._3345_smallest_divisible_digit_product_i;

class Solution {

    public int smallestNumber(int n, int t) {

        int k = n;
        while (getProduct(k) % t != 0) {
            k++;
        }

        return k;
    }

    private int getProduct(int k) {
        int product = 1;
        while (k > 0) {
            product *= (k % 10);
            k /= 10;
        }
        return product;
    }
}
