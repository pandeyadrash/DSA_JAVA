import java.util.*;
public class whileloop {
         public static void main(String[] args) {

// PRINT HELLO WORLD  
            //  int counter = 0;
            //  while(counter<10) {
            //     System.out.println("helloworld");
            //     counter++;
            //  }
            //  System.out.println("print HW 10x");

// PRINT NUMBER 1 TO 10 

            // int counter = 1;
            // while (counter <= 10){
            //     System.out.println(counter);
            //     counter++;
            // }
            // System.out.println();

// PRINT NUMBER FROM 1 TO N
            // Scanner sc = new Scanner(System.in);
            // int range = sc.nextInt();
            // int counter = 1;   

            // while (  counter <= range){
            //     System.out.println(counter + " ");
            //     counter++;
            // }
            // System.out.println();

// PRINT SUM OF FIRST N NATURAL NUMBER
             
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             int sum = 0;
            
             int i = 1;
             while(i<=n){
                sum +=  i;
                i++;
             }

             System.out.println("sum is : "+ sum);
         }
}