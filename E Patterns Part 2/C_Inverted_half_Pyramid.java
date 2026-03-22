
// Inverted Half-Pyramid With Nummber

/*

12345
1234
123
12
1

*/

import java.util.Scanner;

public class C_Inverted_half_Pyramid
{
    public static void inverted_half_Pyramid(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
        
        inverted_half_Pyramid(a);

        s.close();
    }

}
//Output:-

/*

12345
1234
123
12
1

*/