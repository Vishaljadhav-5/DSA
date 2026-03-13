//Question 1 : Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("The given number is Positive");
        }
        else{
            System.out.println("The given number is Negative");
        }
        sc.close();
    }
}


//Output:-

//Enter a number: -5
//The given number is Negative