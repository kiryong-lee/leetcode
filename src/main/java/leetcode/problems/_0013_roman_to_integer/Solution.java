package leetcode.problems._0013_roman_to_integer;

class Solution {

    public int romanToInt(String s) {

        int sum = 0;
        int previous = Integer.MAX_VALUE;
        for (Character c : s.toCharArray()) {
            int current = valueOf(c);
            sum += current;
            if (previous < current) {
                sum -= previous * 2;
            }
            previous = current;
        }

        return sum;
    }

    private int valueOf(char roman) {
        return switch (roman) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
