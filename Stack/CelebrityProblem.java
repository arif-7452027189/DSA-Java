import java.util.Stack;

public class CelebrityProblem {

    public static int celebrityProblem(int[][] arr) {

        int n = arr.length;
        Stack<Integer> stack = new Stack<>();

        // Push all people into stack
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        // Eliminate non-celebrities
        while (stack.size() > 1) {

            int a = stack.pop();
            int b = stack.pop();

            if (arr[a][b] == 1) {
                // a knows b -> a cannot be celebrity
                stack.push(b);
            } else {
                // a doesn't know b -> b cannot be celebrity
                stack.push(a);
            }
        }

        // No candidate
        if (stack.isEmpty()) {
            return -1;
        }

        // Potential celebrity
        int cel = stack.pop();

        // Verify celebrity
        for (int j = 0; j < n; j++) {

            if (j == cel) {
                continue;
            }

            // Celebrity should not know anyone
            if (arr[cel][j] == 1) {
                return -1;
            }

            // Everyone should know celebrity
            if (arr[j][cel] == 0) {
                return -1;
            }
        }

        return cel;
    }

    public static void main(String[] args) {

        int[][] arr = {
                { 0, 1, 0 },
                { 0, 0, 0 },
                { 0, 1, 0 }
        };

        System.out.println(celebrityProblem(arr));
    }
}