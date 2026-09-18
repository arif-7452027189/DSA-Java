
// Insert Intervals
import java.util.*;

public class InsertIntervals {
    public static int[][] intervals(int[][] intervals, int[] newIntervals) {
        List<int[]> result = new ArrayList<>();

        for (int[] current : intervals) {
            if (current[1] <= newIntervals[0])
                result.add(current);

            else if (current[0] < newIntervals[1]) {
                newIntervals[0] = Math.min(newIntervals[0], current[0]);
                newIntervals[1] = Math.max(newIntervals[1], current[1]);
            } else {
                result.add(newIntervals);
                newIntervals = current;
            }
        }
        result.add(newIntervals);
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 6, 9 } };
        int[] newIntervals = { 2, 5 };
        int[][] answer = intervals(intervals, newIntervals);
        for (int[] interval : answer) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
