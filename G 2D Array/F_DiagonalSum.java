public class F_DiagonalSum 
{
    public static int dig(int matrix[][])
    {
        int sum = 0;

        //TC =O(n^2)

        /* 

        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                if (i==j)
                {
                    sum+= matrix[i][j];
                }
        
                if (i+j == matrix.length-1) 
                {
                    sum+= matrix[i][j];
                }
                
            }
        }
        
        */

        // More efficient code, TC=O(n)
        
        for (int i = 0; i < matrix.length; i++) 
        {
            //Primary Diagonal
            sum+=matrix[i][i];

            //Secondary Diagonal
            if (i != matrix.length-i-1) 
            {
                sum+=matrix[i][matrix.length-i-1];
            }
           
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        int mx[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};

        System.out.println("Sum is: "+ dig(mx));
        
    }
}

// Output:-

/*

Sum is: 68 

*/