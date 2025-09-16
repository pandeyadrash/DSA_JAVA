

import java.util.*;
public class breakstatement {
    public static void main(String[] args) {
        // for( int i=1; i<=5; i++ ){
        //     if(i==3){
        //         break;
        //     }
        //     System.err.println(i);
        // }
        // System.err.println("i am out of the loop");

        Scanner sc = new Scanner (System.in);

        do { 
            int n = sc.nextInt();
            if (n % 10 == 0){
                break;
            }
            System.out.println(n);
        } while (true);

    }
}