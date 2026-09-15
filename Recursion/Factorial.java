/*
Question:
Factorial Using Recursion

Given a number n, find its factorial using recursion.

Factorial:
n! = n × (n - 1) × (n - 2) × ... × 1

Example:
Input: 5
Output: 120

Approach:
If n is 0 or 1, return 1.
Otherwise, return n multiplied by factorial of (n - 1).

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class Factorial {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println(factorial(n));
    }
}