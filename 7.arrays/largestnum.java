
public class largestnum {
    public static int largest_num(int numbers[]) {
        
        int largest = Integer.MIN_VALUE; // Initialize to the smallest possible integer
        int smallest = Integer.MAX_VALUE; // Initialize to the largest possible integer

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }           
        }
        System.out.println("The smallest number in the array is: " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {3, 5, 7, 2, 8};
        int largest = largest_num(numbers);
        System.out.println("The largest number in the array is: " + largest);
    }    

}