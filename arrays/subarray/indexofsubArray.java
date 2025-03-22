
public class indexofsubArray {

    public static void main(String[] args) {
        int arr[] = {2, 4, 56, 7, 8, 9, 23};
        int target = 15;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    System.out.print(i + "  " + j);
                }
            }

        }
    }

}
