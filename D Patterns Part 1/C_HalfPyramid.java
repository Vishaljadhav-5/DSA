// Print HALF PYRAMID Pattern

import java.util.Scanner;

public class C_HalfPyramid
{
    public static void main(String[] args) {
        int n;
        Scanner vj=new Scanner(System.in);
        System.out.print("Enter the value: ");
        n= vj.nextInt();

        for(int line=1;line<=n;line++){
            for(int number=1;number<=line;number++){
                System.out.print(number);
            }System.out.println();
        }
        vj.close();
    }
}

//Output:-

/*
Enter the value: 7
1
12
123
1234
12345
123456
1234567
*/