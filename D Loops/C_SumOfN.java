//Print the sum of first n natural number

import java.util.Scanner;

public class C_SumOfN 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int i = 1;

        int sum = 0;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.print("Sum of first n natural number is : "+ sum);
        sc.close();
    }
}

//Output:-

//Enter the value of n: 10
//Sum of first n natural number is : 55
