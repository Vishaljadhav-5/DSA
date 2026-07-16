//Print out the sum of the numbers in the second row of the 'nums' array

public class I_Q2 
{
    public static void main(String[] args) 
    {
        int [][] nums = {{1,4,9},{11,4,3},{2,2,3}};

        int sum = 0;

        //not a efficient as TC = o(n^2)
        /*
        
        for (int i = 0; i < nums.length; i++) 
        {
            for (int j = 0; j < nums[0].length; j++) 
            {
                if ( i == 1) 
                {
                    sum+= nums[i][j];
                    
                }
            }
        } 
        
        */

        for (int j = 0; j < nums[0].length; j++) 
        {
            sum += nums[1][j];
        }
        System.out.println("sum is: "+ sum);
    }
}

// Output:-

/* 

sum is: 18

*/