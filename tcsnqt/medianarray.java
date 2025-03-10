
import java.util.*;

public class medianarray {

    public static void getMedian(int arr[], int n) {
        Arrays.sort(arr);
        if (n % 2 == 0) {
            int in1 = (n / 2) - 1;
            int in2 = n / 2;
            System.out.print((double) (arr[in1] + arr[in2]) / 2);

        } else {
            System.out.print(arr[n / 2]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 3, 1, 5, 6};
        int n = 6;
        System.out.print("The Median of Arrays:");
        getMedian(arr, n);

    }
}
