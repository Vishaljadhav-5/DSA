import java.util.Scanner;

public class C_Product
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = a*b;

        System.out.println(product);

        sc.close(); // Closing the resources
    }
}

// Output:-

/*

10
5
50

*/