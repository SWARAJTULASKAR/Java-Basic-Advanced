
public class sumofarray {

    public static void sumArray(int numbers[]) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        System.out.print("Sum of array is : " + sum);

    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        sumArray(numbers);
    }
}
