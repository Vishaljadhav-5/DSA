// Selection Sorting

// TC = O(n^2)

public class C_SelectionSort 
{
    public static void selectionSort(int vj[])
    {
        int i=0;
        while (i < vj.length - 1) 
        {
                int minPos = i;
                int j = i+1;
                while (j<vj.length) 
                {
                    if (vj[minPos] > vj[j])  // Use "<" in case of Descending Order
                    {
                        minPos = j;          
                    }
                    j++;
                }

                //Swap
                int temp = vj[minPos];
                vj[minPos] = vj[i];
                vj[i] = temp;   
                i++; 
        }

        /* 

        for (int i = 0; i < vj.length - 1; i++) 
        {
            int minPos = i;
            for (int j = i+1; j < vj.length; j++) 
            {
                if (vj[minPos] > vj[j])  // Use "<" in case of Descending Order
                {
                    minPos = j;          
                }
            }

            //Swap
            int temp = vj[minPos];
            vj[minPos] = vj[i];
            vj[i] = temp; 
        }

        */
    }
    

    public static void printArray(int vj[])
    {
        for (int i = 0; i < vj.length; i++) 
        {
            System.out.print( vj[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        int vj[] = {9,3,7,5,1,2,11};
        selectionSort(vj);
        printArray(vj);
    }
}

// Output:-

/*

1 2 3 5 7 9 11 

*/