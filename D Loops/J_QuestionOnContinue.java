//Display all numbers by user except multiple of 10

import java.util.Scanner;

public class J_QuestionOnContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Your number (enter -1 to exit): ");
            int n = sc.nextInt();

            if (n == -1) { // exit condition
                break;
            }

            if (n % 10 == 0) {
                continue;
            }

            System.out.println("Number was : " + n);
        }

        sc.close();
        System.out.println("Scanner closed. Program terminated.");
    }
}

//Output:-

/*
Enter Your number (enter -1 to exit): 55
Number was : 55
Enter Your number (enter -1 to exit): 54
Number was : 54
Enter Your number (enter -1 to exit): 14
Number was : 14
Enter Your number (enter -1 to exit): 20
Enter Your number (enter -1 to exit): 44 
Number was : 44
Enter Your number (enter -1 to exit): -1
Scanner closed. Program terminated.
*/
