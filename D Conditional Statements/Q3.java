//Question 3 : Write a Java program to input week number(1-7) and print day of week name using switch case.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter day number between 1-7: ");

        int week = sc.nextInt();

        switch (week) {
            case 1: System.out.println("MONDAY");
                break;

            case 2: System.out.println("TUESDAY");
                break;

            case 3: System.out.println("WEDNASDAY");
                break;

            case 4: System.out.println("THUSDAY");
                break;

            case 5: System.out.println("FRIDAY");
                break; 
            
            case 6: System.out.println("SATURDAY");
                break;

            case 7: System.out.println("SUNDAY");
                break;

            default: System.out.println("sorry");
                break;
        }
        sc.close();
  }
}

// Output:-

//Enter day number
// 5
// FRIDAY