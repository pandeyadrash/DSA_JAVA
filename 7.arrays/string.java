public class string {
    public static int main(String String[],  String key) {

        for (int i = 0; i < String.length; i++) {
            if (String[i].equals(key)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String String[] = {"dosha", "bhatura", "chole", "puri", "lassi"};
        String key = "puri";


        int index = main(String, key);
        if (index == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}