/*

Question 1

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1, 2, 3, 1]
Output: true

Example 2:
Input: nums = [1, 2, 3, 4]
Output: false

Example 3:
Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
Output: true

Constraints:

1 <= nums.length <= 10^5

-10^9 <= nums[i] <= 10^9

*/

public class Q1 {

    public static boolean twice(int numbs[]){

        for (int i = 0; i < numbs.length; i++) {
            for (int j = i+1; j < numbs.length; j++) {
                if (numbs[i] == numbs[j]) {
                return true;
                }
            }
        }
            
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,5};
        System.out.println("The Array is: "+ twice(nums));
    }
}

// Output:-

/*

The Array is: false

*/