/*
Question:
Check if a String is Palindrome

Given a String, check whether it reads the same
forward and backward.

Example:
Input:  "madam"
Output: true

Input:  "hello"
Output: false

Approach:
Compare characters from the beginning and end of the String.
If any pair of characters is different, the String is not a palindrome.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class PalindromeString {

    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "madam";

        System.out.println(isPalindrome(str));
    }
}