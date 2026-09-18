// // Permutation Number
// input = {1, 2, 3};
// output = [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]

import java.util.List;
import java.util.ArrayList;

public class Permutation {
    public static List<List<Integer>> permutation(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(nums, used, new ArrayList<>(), result);
        return result;
    }

    public static void backtrack(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // skip if already exit
            if (used[i])
                continue;

            // add number
            current.add(nums[i]);
            used[i] = true;

            backtrack(nums, used, current, result);

            current.remove(current.size() - 1);
            used[i] = false;

        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(permutation(nums));
    }
}
