// Print Hollow Rectangle Pattern

/*

* * * * *
*       *
*       *
*       *
* * * * *

*/

import java.util.Scanner;

public class A_HollowRectangle
{

    public static void hollow_rectangle(int totrows,int totcols){

        for(int i=1;i<=totrows;i++){

            for(int j=1;j<=totcols;j++){
                if (i==1 || i == totrows || j==1 || j == totcols) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
        System.out.print("Enter b: ");
        int b = s.nextInt();

        hollow_rectangle(a, b);

        s.close();
    } 
}

//Output:-

/*

Enter a: 4
Enter b: 5
* * * * * 
*       *
*       *
* * * * *

*/