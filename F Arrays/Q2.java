/*
 Given a sorted and rotated array arr[] of n distinct elements, 
 the task is to find the index of given key in the array. 
 If the key is not present in the array, return -1.

Examples:  

Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
Output: 8
Explanation: 3 is present at index 8 in arr[].


Input: arr[] = [3, 5, 1, 2], key = 6
Output: -1
Explanation: 6 is not present in arr[].


Input: arr[] = [33, 42, 72, 99], key = 42
Output: 1
Explanation: 42 is found at index 1.
 */

import java.util.Scanner;

public class Q2 {
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

Enter the size of the array: 7
Enter the elements of the array: 5 6 7 0 1 2 4
Enter the key to search: 0
Key found at index: 3

*/
