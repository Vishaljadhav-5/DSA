// Write a Program to find a Transpose of a matrix for 2*3
//Swapping rows and column

public class J_Q3 
{
    public static void printMatrix(int arr[][])
    {

        System.out.println("The matrix is: ");
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[0].length; j++) 
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) 
    {
        int [][]matrix = {{1,4,9},{11,4,3}};
        int row = 2,column = 3;

        printMatrix(matrix);

        int [][] Transpose = new int[column][row];

        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                Transpose[j][i] = matrix[i][j];   
            }
            
        }
        printMatrix(Transpose);
    }
}


// Output:-

/* 

The matrix is: 
1 4 9 
11 4 3 

The matrix is: 
1 11 
4 4 
9 3 

*/