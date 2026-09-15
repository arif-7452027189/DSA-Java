import java.util.*;

/*
Question:
Binary Search

Given a sorted array and a target value, find the index of the target.
If the target is not present, return -1.

Example:
Input:  [2, 4, 6, 8, 10, 12]
Target: 8
Output: 3

Approach:
Use two pointers, start and end.
Find the middle element and compare it with the target.
If the target is smaller, search in the left half.
If the target is greater, search in the right half.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12 };
        int target = 8;

        System.out.println(binarySearch(arr, target));
    }
}