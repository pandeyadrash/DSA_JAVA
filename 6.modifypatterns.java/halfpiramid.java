public class halfpiramid {
    public static void inverted_rotated_half_piramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_rotated_half_piramid(5);
    }
}