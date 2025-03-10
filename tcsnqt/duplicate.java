
import java.util.Arrays;

public class duplicate {

    public static int duplicate(int arr[]) {
        Arrays.sort(arr);
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;

    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 1, 1, 2, 3, 4, 4, 5, 6};
        int k = duplicate(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
