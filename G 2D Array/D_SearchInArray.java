import java.util.Scanner; 

public class D_SearchInArray
{

    //Search an element in array
    public static boolean search(int matrix[][],int key)
    {
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                if(matrix[i][j] == key)
                {
                    System.out.println("Found at: ("+ i +","+j+ ")" );
                    return true;
                }
            }
        }
        System.out.println("Not found !");
                return false;
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

        search(matrix, 64);
    }
}

// Output:-

/*

Enter element: 
45
74
85
25
65
64
24
14
25

Matrix Array is: 
45 74 85 
25 65 64 
24 14 25 

Found at: (1,2)

*/