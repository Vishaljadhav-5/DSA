import java.util.Scanner;

public class G_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': System.out.println(a+b);
                break;
            case '-': System.out.println(a-b);
                break;
            case '*': System.out.println(a*b);
                break;
            case '/': System.out.println(a/b);
                break;
            case '%': System.out.println(a%b);
                break;
            default: System.out.println("Wrong Operator.");
                break;
        }

        sc.close();
    }
}
//Output:-

//Enter a: 20
// Enter b: 10
// Enter operator: *
// 200
