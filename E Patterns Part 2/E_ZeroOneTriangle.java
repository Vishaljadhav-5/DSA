// 0-1 Traingle

/*

Enter a: 5
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1

*/

import java.util.Scanner; 

public class E_ZeroOneTriangle
{
    public static void zero_one_triangle(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                if ((i+j)%2==0) {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }
    }
    
     public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
        zero_one_triangle(a);
        
        s.close();
    }
}

// Output:-

/*

Enter a: 5
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1

*/