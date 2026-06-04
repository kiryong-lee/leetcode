package leetcode.problems._3751_total_waviness_of_numbers_in_range_i;

class Solution {
    public int totalWaviness(int num1, int num2) {
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            char[] chars = Integer.toString(i).toCharArray();
            for (int j = 1; j < chars.length - 1; j++) {
                if (checkWaviness(chars[j] - '0', chars[j - 1] - '0', chars[j + 1] - '0')) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean checkWaviness(int num, int prev, int next) {
        if (num > prev && num > next) {
            return true;
        } else if (num < prev && num < next) {
            return true;
        }
        return false;
    }
}
