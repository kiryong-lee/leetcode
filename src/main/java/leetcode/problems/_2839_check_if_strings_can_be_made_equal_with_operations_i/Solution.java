package leetcode.problems._2839_check_if_strings_can_be_made_equal_with_operations_i;

class Solution {

    public boolean canBeEqual(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        if (s1.charAt(0) != s2.charAt(0) && s1.charAt(1) != s2.charAt(1)) {
            swap(chars1, 0, 2);
            swap(chars1, 1, 3);
        } else if (s1.charAt(0) != s2.charAt(0)) {
            swap(chars1, 0, 2);
        } else if (s1.charAt(1) != s2.charAt(1)) {
            swap(chars1, 1, 3);
        }
        String newS1 = new String(chars1);
        return newS1.equals(s2);
    }

    private static void swap(char[] chars, int first, int second) {
        char tmp = chars[first];
        chars[first] = chars[second];
        chars[second] = tmp;
    }
}
