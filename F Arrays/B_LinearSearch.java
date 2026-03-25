// Linear Search

import java.util.*;

public class B_LinearSearch {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        int key = 12;

        Scanner VJ = new Scanner(System.in);

        System.out.println("Enter Array: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = VJ.nextInt();
        }

        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("Key is not found.");
        } else {
            System.out.println("Key is at index: " + index);
        }
        VJ.close();
    }

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

//Output:-

//Enter Array: 
// 10
// 20
// 30
// 47
// 51
// 35
// 12
// 54
// 45
// 52
// Key is at index: 6