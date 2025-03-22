
import java.util.Scanner;

public class prep1 {

    // get   avearage of middle number and print it 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mid = n / 2;
        if (n % 2 == 1) {
            System.out.println(arr[mid]);
        } else {
            int avg = (arr[mid - 1] + arr[mid]) / 2;
            System.out.println(avg);
        }
    }
}
