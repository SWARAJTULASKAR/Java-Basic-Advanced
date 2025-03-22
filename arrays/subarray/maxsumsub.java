
public class maxsumsub {

    public static void maxsum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k < end; k++) {
                    sum = arr[k] + arr[k + 1];
                    System.out.print(arr[k] + " ");
                    System.out.println("sum of array is " + sum);
                }
                System.out.println();
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        maxsum(arr);

    }
}
