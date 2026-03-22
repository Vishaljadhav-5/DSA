
// Inverted and Rotated Half Pyramid

/*

               *
           *   *
       *   *   *
    *   *   *  *
*   *   *   *  *


*/

import java.util.Scanner;

public class B_InvertedRotatedPyramid{

    public static void invertedRotatedPyramid(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = s.nextInt();
    
        invertedRotatedPyramid(a); 

        s.close();
    }
}

// Output :-

/*

Enter a number: 5
        * 
      * *
    * * *
  * * * *
* * * * *

*/
