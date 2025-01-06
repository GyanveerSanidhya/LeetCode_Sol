/* Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1 */


import java.util.*;

public class Solution1 {
    public boolean isPalindrome(int n) {
        // Convert the integer to a string
        String s = Integer.toString(n);
        String reversed = "";

        // Reverse the string
        for (int i = 0; i < s.length(); i++) {
            reversed = s.charAt(i) + reversed;
        }
        System.out.println("Reversed number: " + reversed);
        // Check if the original string and the reversed string are equal
        return s.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("THIS IS A PROGRAM TO CHECK WHETHER A NUMBER IS A PALINDROME NUMBER OR NOT");

        System.out.print("Enter a number: ");
        int input = Sc.nextInt();

        Solution1 solution = new Solution1();
        boolean isPalindrome = solution.isPalindrome(input);
       
        System.out.println("Palindrome: " + isPalindrome);
    }
}
