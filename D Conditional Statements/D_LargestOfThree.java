public class D_LargestOfThree {
    public static void main(String[] args) {
        int a = 1, b= 3, c = 6;

        if ((a>=b) && (a>=c)) {
            System.out.println("a is Largest.");
        }
        else if (b>=c) {
            System.out.println("b is Largest.");
        }
        else{
            System.out.println("c is Largest.");
        }
    }
}

//Output:-

//c is Largest.