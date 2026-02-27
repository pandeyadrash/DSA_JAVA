
public class forloop {
    public static void main(String[] args) {
// PRINT HELLO WORLD
        // // for(int i=1; i<=10; i++){
        // //     System.out.println("hello world !");
        // }

// PRINT SQUARE PATTERN

        // for (int line = 1; line<=4; line++){
        //     System.out.println("****");
        // }

// print REVERSE OF A NUMBER   
           
    // int n = 10899;

    // while(n>0){
    //     int lastdigt = n % 10;
    //     System.out.println(lastdigt);
    //     n  = n / 10;
    // }    
    // System.out.println();

// REVERSE THE GIVEN NUMBER
        int n = 1089;
        int rev = 0;

        while(n>0){
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n = n/10;
        }

        System.out.println(rev);

        }
}

