// Butterfly Pattern

/*

*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *

*/

import java.util.Scanner; 

public class F_ButterflyPattern
{
    

    
    public static void butterfly(int n){
        //for 1st half
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                    System.out.print("*");
            }

            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }

            //For 2nd half
        for(int i=n;i>=1;i--){

            for(int j=1;j<=i;j++){
                    System.out.print("*");
            }

            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
    
        butterfly(a);

        s.close();
       
    }
}

// Output:-

/*

Enter a: 5
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *

*/
