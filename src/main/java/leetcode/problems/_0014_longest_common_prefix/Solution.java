package leetcode.problems._0014_longest_common_prefix;

class Solution {

    public String longestCommonPrefix(String[] strs) {

        String commonString = strs[0];
        for (int i = 1; i < strs.length; i++) {
            commonString = commonPrefix(commonString, strs[i]);
        }

        return commonString;
    }

    private String commonPrefix(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                sb.append(str1.charAt(i));
            } else {
                break;
            }
        }

        return sb.toString();
    }
}
