//Print the star pattern

import java.util.Scanner;

public class A_StarPattern 
{
     public static void main(String[] args) {
        int s;
        Scanner vj = new Scanner(System.in);
        System.out.print("Enter the value: ");
        s = vj.nextInt();
        for (int line=1; line<=s;line++){
            //one line
            for(int star=1 ;star<=line ;star++){
                System.out.print("*");
            }
            System.out.println();
        }

        vj.close();
    }
}


//Output:-

/*
Enter the value: 5
*
**
***
****
*****
*/