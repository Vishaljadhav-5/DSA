import java.util.Scanner; 

public class B_LargestInArray
{

    //Searching largest element in 2D array
    public static void largest(int matrix[][])
    {
        int p = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                if(matrix[i][j] > p)
                {
                    p = matrix[i][j];
                }
            }
        }
        System.out.println("Largest element is: " + p);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        System.out.println("Enter element: ");

        //input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
            
        }

        //Display
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        largest(matrix);
    }
}

// Output:-

/*

Enter element: 
45
22
14
78
65
42
14
85
65

45 22 14 
78 65 42 
14 85 65 

Largest element is: 85

*/