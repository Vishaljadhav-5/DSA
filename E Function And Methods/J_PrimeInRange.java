
//Print all prime in a range

public class J_PrimeInRange {

    public static boolean isprime(int n){
        if(n==2){
            return true;
        }

        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n){
        for(int i = 2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primesInRange(200);
    }
}

// Output:-

// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101 103 107 
// 109 113 127 131 137 139 149 151 157 163 167 173 179 181 191 193 197 199