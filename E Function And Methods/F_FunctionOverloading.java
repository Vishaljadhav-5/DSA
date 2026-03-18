// Function overloading using parameters

public class F_FunctionOverloading {

    // Function to calculate sum of 2 no.
    public static int sum(int a,int b){
        return a+b;
    }

    // Function to calculate sum of 3 no.
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(5, 3, 4));
    }
}

//Output:-

//5
//12