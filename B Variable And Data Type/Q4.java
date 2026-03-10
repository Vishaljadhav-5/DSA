/*
Question 4: What will be the type of result in the following Java code?

byte b = 4;
char c = 'a';
short s = 512;
int i = 1000;
float f = 3.14f;
double d = 99.9954;

result = (f * b) + (i % c) - (d * s);

(Hint : Look at the largest data type among these)

*/

public class Q4 {
    public static void main(String args[]) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        Double result = (f * b) + (i % c) - (d * s);

        System.out.println(result);
    }
}


// Output:-

/*

In the mentioned code, the result variable will be of double type because of type conversion.

-51155.08479862671

*/


