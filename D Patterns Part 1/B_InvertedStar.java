// Print Inverted Star Pattern

import java.util.Scanner;

public class B_InvertedStar 
{
    public static void main(String[] args) {
        //int s;
        int n;
        Scanner vj = new Scanner(System.in);
        //s = vj.nextInt();
        System.out.print("Enter the value: ");
        n = vj.nextInt();

        for(int line=1;line<=n;line++){
            
            for(int star=1;star<=(n-line+1);star++){
                System.out.print("*");
            }System.out.println();
        }

        vj.close();
    }
}

//Output:-

/*
Enter the value: 5
*****
****
***
**
*

*/
