// Array Introduction

public class A_Arrays {
    
    //Passing Array in a function
    public static void update(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i]=marks[i]+1;
        }
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};

        update(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        } 
    }
}

//Output:-

//3 5 7 9 11 13 15 
