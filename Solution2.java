/*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 

Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.*/





import java.util.*;

class Solution2 {
    // Method to add 1 to the number represented as an array of digits
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // If the digit is 9, set it to 0 and continue
        }

        // If we reached here, it means all digits were 9, so we need an extra digit
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // The new number starts with 1
        return newDigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for array size
        System.out.print("Enter the number of digits of the number: ");
        int n = sc.nextInt();

        if (n <= 0 || n > 9) {
            System.out.println("Array size must be greater than zero and less than or equal to 9.");
            sc.close();
            return;
        }

        // Ask user to enter number in digit array format
        System.out.println("Enter your number (one digit at a time):");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0 || arr[i] > 9) {
                System.out.println("Invalid input! Digits must be between 0 and 9.");
                sc.close();
                return;
            }
        }

        System.out.println("Your Number: " + Arrays.toString(arr));
        
        // Call the plusOne method
        Solution2 solution = new Solution2();
        int[] result = solution.plusOne(arr);

        // Print the result
        System.out.println("Result after adding 1: " + Arrays.toString(result));

        sc.close();
       
    }
}
