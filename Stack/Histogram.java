// Largest Rectangle in Histogram

import java.util.Stack;

public class Histogram {
    public static int histogram(int[] heights) {
        int n = heights.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        Stack<Integer> stack = new Stack<>();
        // Next Smaller Element
        nse[n - 1] = n;
        stack.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            while (stack.size() > 0 &&
                    heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.size() == 0)
                nse[i] = n;
            else
                nse[i] = stack.peek();
            stack.push(i);
        }
        // Clear stack
        stack.clear();
        // Previous Smaller Element
        pse[0] = -1;
        stack.push(0);
        for (int i = 1; i < n; i++) {
            while (stack.size() > 0 &&
                    heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.size() == 0)
                pse[i] = -1;
            else
                pse[i] = stack.peek();

            stack.push(i);
        }
        // Calculate maximum area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = { 5, 3, 6, 2, 5, 4, 1 };
        System.out.println(histogram(heights));
    }
}