// Palindromic Pattern with numbers

/*

Enter a number : 5
    1
   212
  32123
 4321234
543212345

*/


import java.util.*;
public class K_Palindrome
{

    public static void palindrome(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print ("Enter a number : ");
        int a = s.nextInt();
    
        palindrome(a);

        s.close();
    }
}

// Output:-

/*

Enter a number : 5
    1
   212
  32123
 4321234
543212345

*/