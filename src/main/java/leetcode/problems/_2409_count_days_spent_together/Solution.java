package leetcode.problems._2409_count_days_spent_together;


class Solution {

    public static final int[] DAYS_IN_MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int aliceStartDay = toDayOfYear(arriveAlice);
        int aliceEndDay = toDayOfYear(leaveAlice);
        int bobStartDay = toDayOfYear(arriveBob);
        int bobEndDay = toDayOfYear(leaveBob);

        int together = Math.min(aliceEndDay, bobEndDay) - Math.max(aliceStartDay, bobStartDay);
        return Math.max(together + 1, 0);
    }

    private int toDayOfYear(String stringDay) {
        String[] split = stringDay.split("-");
        int month = Integer.parseInt(split[0]);
        int day = Integer.parseInt(split[1]);

        int result = 0;
        for (int i = 0; i < month; i++) {
            result += DAYS_IN_MONTH[i];
        }
        return result + day;
    }
}
