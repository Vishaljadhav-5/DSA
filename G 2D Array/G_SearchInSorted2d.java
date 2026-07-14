public class G_SearchInSorted2d 
{

    public static boolean staircase(int matrix[][],int key)
    {
        
       //in case of Right Top cell 

        /*int row = 0,col = matrix.length-1;

        while (row < matrix.length && col >= 0) 
        {
            if (matrix[row][col] == key) 
            {
                System.out.println("key found at: ("+ row +","+col + ")");
                return true;
            }
            else if (key < matrix[row][col]) 
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        System.out.println("Key not FOUND!");
        return false;

        */

        //In case of left bottom
        int row = matrix[0].length - 1, col = 0;

        while (col < matrix.length-1 && row >= 0) 
        {
            if (matrix[row][col] == key) 
            {
                System.out.println("key found at: ("+ row +","+col + ")");
                return true;
            }
            else if (key < matrix[row][col]) 
            {
                row--;
            }
            else
            {
                col++;
            }
        }
        System.out.println("Key not FOUND!");
        return false;
    } 


    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48},
                         {32,33,39,50}};

        staircase(matrix, 37);

    }
}

// Output:-

/*

key found at: (2,2)

*/