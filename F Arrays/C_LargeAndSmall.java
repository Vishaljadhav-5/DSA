// Large number in Array
public class C_LargeAndSmall {
    public static int getL(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            //Largest element in array
            if (largest < numbers[i]) 
            {
                largest = numbers[i]; 
            }

            //smallest element in array
            if(smallest > numbers[i])
            {
                smallest = numbers[i];
            }
        }
        
        System.out.println("Smallest Value is:" + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 12, 8};

        System.out.println("Largest Value is :" + getL(numbers));
    }
}

//Output:-

//Smallest Value is:1
//Largest Value is :12
