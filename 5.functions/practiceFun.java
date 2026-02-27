
import java.util.Scanner;

// Write a Java method to compute the average of three numbers.

public class practiceFun{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input the first number: ");
        double x = sc.nextDouble();
        
        System.out.print("Input the second number: ");
        double y = sc.nextDouble();
        
        System.out.print("Input the third number: ");
        double z = sc.nextDouble();
        
        System.out.print("The average value is " + average(x, y, z) + "\n");
        
        sc.close(); 
    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }


    /* Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method. */
}