public class E_TernaryOperator {
    public static void main(String[] args) {
        int num =7;

        //Ternary operator
        String type = ((num%2) == 0)? "Even" : "Odd";

        System.out.println("The number is "+ type);
    }
}

//Output:-

//The number is Odd