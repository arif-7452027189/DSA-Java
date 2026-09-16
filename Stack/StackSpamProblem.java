// Stack Span Problem
// Input = {100,80,60,70,60,75,85};
// Output = {1,1,1,2,1,4,6};

import java.util.ArrayList;
import java.util.Stack;

public class StackSpamProblem {
    public static ArrayList<Integer> stackProblem(int[] arr) {
        int n = arr.length;
        int[] spam = new int[n];
        spam[0] = 1;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 0; i < n; i++) {
            while (stack.size() > 0 && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (stack.size() == 0)
                spam[i] = i - (-1);
            else
                spam[i] = i - stack.peek();
            stack.push(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(spam[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 80, 60, 70, 60, 75, 85 };
        System.out.println(stackProblem(arr));
    }
}
