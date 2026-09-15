/*
Question:
Push an Element at the Bottom of a Stack

Given a Stack and an element, insert the element at the bottom
of the Stack without changing the order of the existing elements.

Example:
Input Stack: [1, 2, 3]
Element: 4

Output:
[4, 1, 2, 3]

Approach:
First remove all elements from the Stack using recursion.
Then add the new element at the bottom.
After that, add the removed elements back.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

public class PushAtBottom {

    public static void pushAtBottom(Stack<Integer> stack, int val) {

        if (stack.isEmpty()) {
            stack.push(val);
            return;
        }

        int top = stack.pop();

        pushAtBottom(stack, val);

        stack.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushAtBottom(stack, 4);

        System.out.println(stack);
    }
}