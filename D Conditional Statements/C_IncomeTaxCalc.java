import java.util.Scanner;

public class C_IncomeTaxCalc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income to calculate tax: ");
        int income = sc.nextInt();
        int tax;

        if (income < 50000) {
            tax = 0;
        }
        else if (income >= 50000 && income <10000) {
            tax = (int)(income * 0.2);
        }
        else{
            tax = (int)(income * 0.3);
        }

        System.out.println("Your tax is: "+ tax);
        sc.close();
    }
}

//Output:-

//Enter your income to calculate tax: 65000
//Your tax is: 19500