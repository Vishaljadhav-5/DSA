// Hollow Rhombus

/*

Enter a: 8
       ********
      *      *
     *      *
    *      *
   *      *
  *      *
 *      *
********

*/

import java.util.Scanner; 

public class H_HollowRhombous
{
    public static void hollow_rhombus(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){

                if (i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
       
        hollow_rhombus(a);

        s.close();
    
    }
}

// Output :-

/*

Enter a: 8
       ********
      *      *
     *      *
    *      *
   *      *
  *      *
 *      *
********

*/