// Number Pyramid

/*

Enter a: 7
      1 
     2 2
    3 3 3 
   4 4 4 4
  5 5 5 5 5
 6 6 6 6 6 6
7 7 7 7 7 7 7

*/

import java.util.Scanner; 

public class J_NumberPyramid
{
    public static void NumberPyramid(int n){
        //outer loop
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i +" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
       
        NumberPyramid(a);
        s.close();
    
    }
}


// Output:-

/*

Enter a: 7
      1 
     2 2
    3 3 3 
   4 4 4 4
  5 5 5 5 5
 6 6 6 6 6 6
7 7 7 7 7 7 7

*/