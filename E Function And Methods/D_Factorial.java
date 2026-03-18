// Factorial of a number n=4

public class D_Factorial{

    public static int factorial(int n){
        int f=1;

        for(int i=1;i<=n;i++){
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println("Factorial is :" + (factorial(5)));
    }
}

// Output:-

// Factorial is :120