//worst case TC = O(n^2)
//best case TC = O(n^2)

public class A_BubbleSort {

    public static void bubbleSort(int vj[])
    {
        for (int i = 0; i < vj.length-1; i++) 
        {
            for(int j = 0 ; j< vj.length-1-i;j++)
            {
                if (vj[j]>vj[j+1])   // Use "<" in case of Descending Order
                {
                    // Swap
                    int temp = vj[j];
                    vj[j] = vj[j+1];
                    vj[j+1] = temp; 
                }
            }
            
        }

        /* 

        int n = vj.length;
        int i=0;
        while (i<n-1) 
        {
            int j =0;
            while (j<n-1-i) 
            {
                if (vj[j]>vj[j+1])  //  Use "<" in case of Descending Order
                {
                    int temp = vj[j];
                    vj[j] = vj[j+1];
                    vj[j+1] = temp; 
                }
                j++;
            }
            i++;    
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
        bubbleSort(vj);
        printArray(vj);
    }
}


// Output:-

/*

1 2 3 5 7 9 11 

*/