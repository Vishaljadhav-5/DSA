import java.util.Scanner; 

public class C_SmallestInArray
{
    //Searching Smallest element in 2D array
    public static void Smallest(int matrix[][])
    {
        int t = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                if(matrix[i][j] < t)
                {
                    t = matrix[i][j];
                }
            }
        }
        System.out.println("Smallest element is: " + t);
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

        System.out.println("Matrix Array is: ");
        //Display
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        Smallest(matrix);
    }
}

// Output:-

/*

Enter element: 
45
78
24
15
46
54
24
41
11

Matrix Array is: 
45 78 24 
15 46 54 
24 41 11 

Smallest element is: 11

*/