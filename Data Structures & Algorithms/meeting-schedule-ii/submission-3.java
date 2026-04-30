/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
    if (intervals == null || intervals.size() == 0) return 0;

    int n = intervals.size();
    int[] starts = new int[n];
    int[] ends = new int[n];

    for (int i = 0; i < n; i++) {
        starts[i] = intervals.get(i).start;
        ends[i] = intervals.get(i).end;
    }

    Arrays.sort(starts);
    Arrays.sort(ends);

    int days = 0;
    int maxDays = 0;
    int i = 0, j = 0;

    while (i < n) {
        if (starts[i] < ends[j]) {
            days++;        // need new day
            i++;
        } else {
            days--;        // free a day
            j++;
        }
        maxDays = Math.max(maxDays, days);
    }

    return maxDays;


    }
}
