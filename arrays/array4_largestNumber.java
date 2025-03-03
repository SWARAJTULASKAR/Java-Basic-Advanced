
// both smallest and largest value find from give array
public class array4_largestNumber {

    public static int getLargest(int marks[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > largest) {
                largest = marks[i];

            }
            if (smallest > marks[i]) {
                smallest = marks[i];

            }
        }
        System.out.println("smallest value is :" + smallest);
        return largest;

    }

    public static void main(String[] args) {
        int marks[] = {2, 4, 6, 8, 50, 12, 14, 10, 18, 20};
        //  int mark = getLargest(marks);

        System.out.print("Largest Number is: " + getLargest(marks));

    }
}
