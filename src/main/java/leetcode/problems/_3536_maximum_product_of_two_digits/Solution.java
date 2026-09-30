package leetcode.problems._3536_maximum_product_of_two_digits;

import java.util.Arrays;

class Solution {

    public int maxProduct(int n) {

        char[] num = Integer.toString(n).toCharArray();
        Arrays.sort(num);
        int first = num[num.length - 1] - '0';
        int second = num[num.length - 2] - '0';

        return first * second;
    }
}
