import java.util.*;

/*
Question:
Queue

Implement a Queue and perform basic operations like:
Add, Remove, Peek and Display.

Queue follows FIFO (First In First Out).

Example:
Input:  10, 20, 30

Remove:
10

Remaining Queue:
20 30

Approach:
Use ArrayDeque to implement the Queue.
Elements are added from the rear and removed from the front.

Time Complexity:
Add: O(1)
Remove: O(1)
Peek: O(1)

Space Complexity: O(n)
*/

public class QueueUsingArrayDe {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        System.out.println("Removed: " + queue.remove());

        System.out.println("Front: " + queue.peek());

        System.out.println("Queue: " + queue);
    }
}