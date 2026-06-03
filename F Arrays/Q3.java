/*

Question 3 : You are given an array prices where prices[i] is the price of a given stock on the ith day.

Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.
You must buy before you sell.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: No transactions are done.


Constraints:
1 <= prices.length <= 10^5
0 <= prices[i] <= 10^4

 */

import java.util.Scanner;

public class Q3 {
    public static int search(int[] arr, int tar) {
        int st = 0;
        int end = arr.length-1;

        while(st <= end){
            int mid = st + (end -st )/2;

            if(arr[mid] == tar)
            {
                return mid;
            }

            //left half
            if(arr[st] <= arr[mid]){
                if(arr[st] <= tar && tar <= arr[mid]){
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
            else{ //Right half
                if(arr[mid] <= tar && tar <= arr[end]){
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            
        }
        return -1;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");

        int n = sc.nextInt();
        int[] arr = new int[n]; 

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }   

        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        int result = search(arr, key);

        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }

        sc.close();
    }
}

// Output:-

/* 



*/
