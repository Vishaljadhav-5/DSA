// Floyd's Traiangle

/*

Enter a: 8
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
22 23 24 25 26 27 28 
29 30 31 32 33 34 35 36 

*/

import java.util.Scanner; 

public class D_FloydsTriangle
{
    public static void floyds_triangle(int n){

        int counter = 1;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

     public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
        
        floyds_triangle(a);
        
        s.close();
    }
}

//Output:-

/*

Enter a: 8
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
22 23 24 25 26 27 28 
29 30 31 32 33 34 35 36 

*/