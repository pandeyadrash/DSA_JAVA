
import java.util.Scanner;

public class basicfun{
    public static void printHelloWorld(){
        System.out.println("HelloWorld!!");
        System.out.println("HelloWorld!!");
        System.out.println("HelloWorld!!");
        System.out.println("HelloWorld!!");
    }

    public static void calculatesum(){
        Scanner Sc = new Scanner (System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int sum = a + b;
        System.out.println("sum is:" + sum );


    }

    public static void main(String[] args) {
      calculatesum();
      printHelloWorld();
    }
}