package leetcode.problems._3483_unique_3_digit_even_numbers;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int totalNumbers(int[] digits) {

        Set<Integer> evenNumbers = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                continue;
            }
            for (int j = 0; j < digits.length; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < digits.length; k++) {
                    if (j == k || k == i || digits[k] % 2 != 0) {
                        continue;
                    }
                    int target = digits[i] * 100 + digits[j] * 10 + digits[k];
                    evenNumbers.add(target);
                }
            }
        }

        return evenNumbers.size();
    }
}
