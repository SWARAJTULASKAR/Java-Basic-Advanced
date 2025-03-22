// ROTATE  ARRAY INPUT N = 5  ROTATE = 2 
// ARR [] = 1,1,3,5,6
// OUTPUT =  5,6,1,1,3

import java.util.Scanner;

public class prep2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res[] = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            res[j] = arr[i];
            j++;

        }
        for (int i = 0; i < n - k; i++) {
            res[j] = arr[i];
            j++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }

}
