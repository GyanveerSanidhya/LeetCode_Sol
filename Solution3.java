/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1] */





import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {}; // Return an empty array if no solution
    }
}

class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for array size
        System.out.print("Enter the number of digits of the number: ");
        int n = sc.nextInt();

        if (n <= 0 || n > 9) {
            System.out.println("Array size must be greater than zero.");
            sc.close();
            return;
        }

        // Ask user to enter elements
        System.out.println("Enter elements");
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Input: " + Arrays.toString(arr.toArray()));

        // Store output index pairs in a list
        List<Integer> outidx = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int a = arr.get(i) + arr.get(j);
                if (a == 9 || a == 6) {
                    System.out.println("Target: " + a);
                    outidx.add(i);
                    outidx.add(j);
                }
            }
        }
        System.out.println("Output: " + Arrays.toString(outidx.toArray()));
    }
}
