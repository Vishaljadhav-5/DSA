import java.util.Scanner;

public class B_EvenOrOdd {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();

        if (num % 2 ==0) {
            System.out.println("The given number is even number.");
        }
        else{
            System.out.println("The given number is odd number.");
        }

        s.close(); //closing the resources
    }
}

//Output:-

//Enter a number: 55
//The given number is odd number.
