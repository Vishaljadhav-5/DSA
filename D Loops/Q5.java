// What is wrong in the following code.

public class Q5 
{
    public static void main(String args[]) {
        int i;

        for( i = 0; i <= 5; i++ ) {
            System.out.println("i = " + i );
        }

        System.out.println("i after the loop = " + i );
    }
}

//Output:-

/*
i = 0
i = 1
i = 2
i = 3
i = 4
i = 5
i after the loop = 6
*/
