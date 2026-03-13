//Question 5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not.

import java.util.Scanner;

public class Q5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        sc.close();

        boolean isLeap = false;

        if (year % 400 == 0) {
            isLeap = true; // A year is a leap year if it is divisible by 400
        } else if (year % 100 == 0) {
            isLeap = false; // A year is not a leap year if it is divisible by 100 but not by 400
        } else if (year % 4 == 0) {
            isLeap = true; // A year is a leap year if it is divisible by 4 but not by 100
        } else {
            isLeap = false; // Otherwise, it is not a leap year
        }

        // Print the result
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

//Output:-

//Enter a year: 2000
//2000 is a leap year.

