
public class sumofarray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.print("Sum of array is " + sum);
    }
}
