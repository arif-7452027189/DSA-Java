/*
Question:
Stack

Implement a Stack and perform basic operations like:
Push, Pop, Peek and Display.

Stack follows LIFO (Last In First Out).

Example:
Input: 10, 20, 30

Pop:
30

Remaining Stack:
10 20

Approach:
Use Stack to store elements.
The last element inserted into the stack is removed first.

Time Complexity:
Push: O(1)
Pop: O(1)
Peek: O(1)

Space Complexity: O(n)
*/

import java.util.*;

public class StackExample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Removed: " + stack.pop());

        System.out.println("Top: " + stack.peek());

        System.out.println("Stack: " + stack);
    }
}