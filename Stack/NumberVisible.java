import java.util.Stack;

public class NumberVisible {
    public static int[] numberofVisible(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int ans[] = new int[n];
        ans[n - 1] = 0;
        stack.push(ans[n - 1]);
        for (int i = n - 2; i > 0; i--) {
            int count = 0;
            while (stack.size() > 0 && stack.peek() <= heights[i]) {
                count++;
                stack.pop();
            }
            if (stack.size() > 0)
                count++;
            heights[i] = count;
            stack.push(heights[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] heights = { 10, 6, 8, 5, 11, 9 };
        numberofVisible(heights);
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + ",");
        }
    }
}
