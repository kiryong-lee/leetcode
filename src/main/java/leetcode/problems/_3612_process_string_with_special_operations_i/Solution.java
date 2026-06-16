package leetcode.problems._3612_process_string_with_special_operations_i;

class Solution {

    public String processStr(String s) {

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (!sb.isEmpty()) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else if (c == '#') {
                sb.append(sb);
            } else if (c == '%') {
                sb.reverse();
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
