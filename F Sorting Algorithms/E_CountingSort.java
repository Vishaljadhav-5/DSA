// Counting Sort

public class E_CountingSort
{
    public static void countingSort(int arr[])
    {
        int largest=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) 
        {
            largest = Math.max(largest, arr[i]);
        }

        //New Array
        int [] count = new int[largest+1];
        for (int i = 0; i < arr.length; i++) 
        {
            count[arr[i]]++;
        }

        //Sorting
        int j=0;
        for (int i = 0; i < count.length; i++) 
        {
            while (count[i] > 0) 
            { 
                arr[j] = i;
                j++;
                count[i]--;
            }
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
        int vj[] = {99,3,7,56,1,22,11};
        countingSort(vj);
        printArray(vj);
    }
}


// Output:-

/*

1 3 7 11 22 56 99

*/