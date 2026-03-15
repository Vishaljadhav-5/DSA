//Write a program that reads a set of integer and then prints the sum of even and odd integer.

import java.util.Scanner;

public class Q2 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       int number;
       int choice;
       int evenSum = 0;
       int oddSum = 0;

       do {
             System.out.print("Enter the number ");
             number = sc.nextInt();
             if( number % 2 == 0) {
                evenSum += number;
             } else {
                oddSum += number;
             }
             
             System.out.print("Do you want to continue? Press 1 for yes or 0 for no ");
             choice = sc.nextInt();
        } while(choice==1);
            
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        
        sc.close();
    }
}
//Output:-

/*
Enter the number 4
Do you want to continue? Press 1 for yes or 0 for no 1
Enter the number 9
Do you want to continue? Press 1 for yes or 0 for no 1
Enter the number 1
Do you want to continue? Press 1 for yes or 0 for no 1
Enter the number 6
Do you want to continue? Press 1 for yes or 0 for no 0
Sum of even numbers: 10
Sum of odd numbers: 10
*/