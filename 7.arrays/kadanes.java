public class kadanes{
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
    

    for(int i=0; i<numbers.length; i++) {
        cs = cs + numbers[i];
        if(cs < 0) {
            cs = 0;
        }
         ms = Math.max(ms, cs);

    }     
    System.out.println("Max sum  subarray is: " + ms);
    }

    public static void main(String[] args) {
        int numbers[] = {-1, -2, 6, -1, 3, -1, -2};
        kadanes(numbers);
    }

}
