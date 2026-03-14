//Print Reverse of a number

public class E_ReverseANumber 
{
    public static void main(String[] args) {
        int n = 10899;

        System.out.println("Digit : "+ n);
        System.out.print("After Reversing: ");
        while (n>0) {
            
            int lastDigit = n%10;

            System.out.print(lastDigit);

            n = n/10;
        }
        System.out.println();
    }
}

//Output:-

//Digit : 10899
//After Reversing: 99801
