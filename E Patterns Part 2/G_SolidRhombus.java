// Solid Rhombus

/*

Enter a number : 5
    *****
   *****
  *****
 *****
*****

*/

import java.util.Scanner; 

public class G_SolidRhombus
{
    public static void solid_rhombus(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = s.nextInt();
        solid_rhombus(a);

        s.close();
    }
}

// Output:-

/*

Enter a number : 5
    *****
   *****
  *****
 *****
*****

*/