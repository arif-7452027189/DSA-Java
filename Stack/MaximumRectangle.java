import java.util.Stack;

public class MaximumRectangle {
    // Largest Rectangle in Histogram
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
        // Calculate Maximum Area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    // Maximum Rectangle in Binary Matrix
    public static int maxRect(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        // Convert matrix rows into histogram heights
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i > 0 && matrix[i][j] == 1) {
                    matrix[i][j] += matrix[i - 1][j];
                }
            }
        }
        // Find maximum area
        int max = 0;
        for (int[] row : matrix) {
            int area = histogram(row);
            max = Math.max(max, area);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 0, 1, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 0 }
        };
        System.out.println("Maximum Rectangle Area: " + maxRect(matrix));
    }
}