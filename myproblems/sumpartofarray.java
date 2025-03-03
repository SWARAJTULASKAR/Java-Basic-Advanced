
import java.util.*;

public class sumpartofarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();

        }
        int[] arr = new int[n];
        System.out.println("Enter Elements of array: ");
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        System.out.print("You entered this array ");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]);

        }

    }

}
