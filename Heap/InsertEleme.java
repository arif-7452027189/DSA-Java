import java.util.*;

/*
Question:
Max Heap - Insert an Element

Given a Max Heap and a new element, insert the element
while maintaining the Max Heap property.

Max Heap Property:
The parent node is always greater than or equal to its children.

Example:

Input:
Heap = [50, 30, 40, 10, 20]
Insert = 60

Output:
[60, 30, 50, 10, 20, 40]

Approach:
1. Add the new element at the end of the heap.
2. Compare it with its parent.
3. If the new element is greater than its parent,
   swap them.
4. Continue until the Max Heap property is restored.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class InsertEleme {

    public static void insert(ArrayList<Integer> heap, int value) {

        heap.add(value);

        int index = heap.size() - 1;

        while (index > 0) {
            int parent = (index - 1) / 2;

            if (heap.get(parent) >= heap.get(index)) {
                break;
            }

            int temp = heap.get(parent);
            heap.set(parent, heap.get(index));
            heap.set(index, temp);

            index = parent;
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> heap = new ArrayList<>();

        heap.add(50);
        heap.add(30);
        heap.add(40);
        heap.add(10);
        heap.add(20);

        insert(heap, 60);

        System.out.println(heap);
    }
}
