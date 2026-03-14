//Print the number from 1 to n

import java.util.Scanner;

public class B_NumberOneToN 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int counter=1;

        while (counter <= n) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();

        sc.close(); //Closing the resources
    }
}
//Output:-

//Enter the value of n: 15
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 
