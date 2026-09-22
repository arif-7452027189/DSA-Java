
import java.util.*;

public class SubsetArray {
    public static List<List<Integer>> subsetArray(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // backtracking(nums, 0, new ArrayList<>(), result);
        backtr(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public static void backtracking(int[] nums, int idx, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = idx; i < nums.length; i++) {
            current.add(nums[i]);
            backtracking(nums, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void backtr(int[] num, int idx, List<Integer> curr, List<List<Integer>> result) {
        result.add(new ArrayList<>(curr));
        for (int i = idx; i < num.length; i++) {
            curr.add(num[i]);
            backtr(num, i + 1, curr, result);
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.print(subsetArray(nums));
    }
}