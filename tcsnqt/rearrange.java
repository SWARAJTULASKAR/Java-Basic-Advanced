
import java.util.*;

public class rearrange {

    public static void main(String[] args) {
        int arr[] = {32, 3242, 4234, 325, 3243, 1, 2, 3, 4, 5, 6, 67, 7, 8,};
        Arrays.sort(arr);
        int n = arr.length - 1;
        System.out.print("Smallest to Largest  number :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

        System.out.println();
        System.out.print("largest to smallest value :");

        for (int j = n; j >= 0; j--) {
            System.out.print(arr[j] + " ");

        }

    }
}
