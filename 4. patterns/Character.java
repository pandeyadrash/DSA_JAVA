public class Character {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A'; // Corrected data type

        // outer loop
        for (int line = 1; line <= n; line++) {
            // inner loop
            for (int i = 1; i <= line; i++) { 
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
