//Chheck if a number is prime or not.

import java.util.Scanner;

public class K_PrimeOrNot 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is a prime number.");
        }
        else{
            boolean isprime = true;

            for (int i = 2; i <= n-1 ; i++) {
                if (n % i ==0) {
                    isprime = false;
                }
            }

            if (isprime == true) {
                System.out.println("n is prime.");
            }
            else{
                System.out.println("n is not prime.");
            }
        }
        sc.close();
    }
}

//Output:-

//Enter a number : 45
//n is not prime.
