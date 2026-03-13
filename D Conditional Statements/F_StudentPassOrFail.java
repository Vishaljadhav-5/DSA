public class F_StudentPassOrFail {
    public static void main(String[] args) {
        int marks = 78;

        //Ternary operator
        String reportCard = (marks >= 33)? "Passed" : "Fail";

        System.out.println("The Student is "+ reportCard);
    }
}

//Output:-

//The Student is Passed