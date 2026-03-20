// Q.1 Write a Java method to compute the average of three numbers.

import java.util.Scanner;
public class Q1 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double x = sc.nextDouble();
        System.out.print("Enter the secound number: ");
        double y = sc.nextDouble();
        System.out.print("Enter the third number: ");
        double z = sc.nextDouble();

        System.out.println("The average value is : " + average(x,y,z)+ "\n");
        sc.close();
    }

    public static double average(double x,double y,double z){
        return (x + y + z)/3;
    }
}