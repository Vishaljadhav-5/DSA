//Print Character Pattern

import java.util.*;
public class D_CharacterPattern { 
    public static void main(String[] args) {

        int n;
        Scanner vj= new Scanner(System.in);
        System.out.print("Enter the value of n: " );
        n= vj.nextInt();
        
        char ch= 'A';

        for(int line=1;line<=n;line++){
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }System.out.println();
        }
        vj.close();
    }
}

//Output:-

/*
Enter the value of n: 5
A
BC
DEF
GHIJ
KLMNO
*/