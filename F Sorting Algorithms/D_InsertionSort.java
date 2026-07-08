// Insertion Sort

public class D_InsertionSort 
{
    public static void insertionSort(int arr[])
    {
        for (int i = 1; i < arr.length; i++) 
        {
            int temp = arr[i];
            int prev = i-1;

            // finding correct position to insert
            while (prev >= 0 && arr[prev] > temp)  // for descending - (prev >=0 && vj[prev] < temp)
            {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            //insertion
            arr[prev + 1] = temp;
        }
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
        insertionSort(vj);
        printArray(vj);
    }
}

// Output:-

/*

1 2 3 5 7 9 11 

*/