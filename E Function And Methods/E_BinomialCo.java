// Binomial coefficient n=5,r=2

public class E_BinomialCo {
    public static int factorial(int n){
        int f = 1;

        for(int i=1;i<=n;i++){
            f *= i;
        }
    return f;
    }

    public static int Bincoeff(int n,int r){
        int n_fac = factorial(n);
        int r_fac = factorial(r);
        int nmr_fac = factorial(n-r);

        int Bincoeff = n_fac / (r_fac * nmr_fac) ;
        return Bincoeff;
    }
    

    public static void main(String[] args) {
        System.out.println(Bincoeff(5,2));
    }
} 

//Output:-

//10