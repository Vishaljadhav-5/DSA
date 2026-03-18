// Check if number is prime or not using function

public class H_PrimeOrNot {

    public static boolean isprime(int n){
        if(n==2){
            return true;

        }


        boolean isprime = true;
        for(int i=2;i<=n-1;i++){
            if(n%i ==0){
                isprime = false;
                return isprime;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        System.out.println(isprime(2));
    }
}

// Output:-

// true