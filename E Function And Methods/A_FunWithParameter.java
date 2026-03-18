// Syntax with parameters

import java.util.*;

public class A_FunWithParameter {

    public static int calculatesum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");

        int b = sc.nextInt();
        int sum = calculatesum(a,b);
        System.out.println("sum is : "+ sum);

        sc.close();
    }
}

// Output:-

// Enter a: 10
// Enter b: 20
// sum is : 30