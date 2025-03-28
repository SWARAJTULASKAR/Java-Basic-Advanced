
public class bubblesort {

    // bubble sort is by using for loop 
    static void bubble_sort(int[] arr, int n) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("after using bubble sort:");
        {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {21, 43, 54, 65, 87, 12, 4, 5, 1, 1, 3};
        int n = arr.length;
        System.out.println("Before using bubble sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        bubble_sort(arr, n);
    }
}
