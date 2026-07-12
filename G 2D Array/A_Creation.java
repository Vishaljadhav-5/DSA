import java.util.Scanner; 

public class A_Creation 
{
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
        System.out.println("Matrix Array is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Output:-

/*

Enter element: 
45
87
65
24
75
99
74
65
45

Matrix Array is: 
45 87 65 
24 75 99 
74 65 45 

*/