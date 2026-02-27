public class numberpiramid {
    public static void number_piramid(int n) {
        for (int i = 1; i <= n; i++) {
            // numbers
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
            }
          
            System.out.println();
        }
    }

    public static void main(String[] args) {
        number_piramid(5);
    }
}