// Write the program to print the multiplication table of a number N, Entered by the user.

import java.util.Scanner;

public class Q4 
{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n;
        System.out.print("Enter the number n: ");
        n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i +  " = " + (n*i));
        }
        sc.close();
    }
}

//Output:-

/*
Enter the number n: 20
20 * 1 = 20
20 * 2 = 40
20 * 3 = 60
20 * 4 = 80
20 * 5 = 100
20 * 6 = 120
20 * 7 = 140
20 * 8 = 160
20 * 9 = 180
20 * 10 = 200
*/

