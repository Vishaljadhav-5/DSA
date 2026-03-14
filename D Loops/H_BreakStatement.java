import java.util.Scanner;

public class H_BreakStatement 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your number: ");
            int n = sc.nextInt();

            if (n%10 == 0) {
                break;
            }

            System.out.println(n);
        } while (true);

        sc.close();
    }    
}

//Output:-

/* 
Enter your number: 2
2
Enter your number: 44
44
Enter your number: 20
*/

