// Diamond Pattern 

/*

Enter a: 5
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

*/

import java.util.Scanner; 

public class I_DiamondPattern
{
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
       
        diamond(a);

        s.close();
    }
}

// Output:-

/*

Enter a: 5
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

*/
