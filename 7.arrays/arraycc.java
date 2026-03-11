
public class arraycc {
    public static void update(int marks[], int nonchangable) {
        nonchangable = 10; // this will not change the value of nonchangable in main method
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = {97, 98, 99};
        int nonchangable = 5;
        update(marks, nonchangable);
        System.out.println(nonchangable);

        // print our updated marks
        for(int i=0; i<marks.length; i++) {     
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}