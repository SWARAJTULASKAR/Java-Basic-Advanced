
public class reversearray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        //int temp = 0;
        int last = arr.length - 1;
        int[] number = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            number[i] = arr[last];
            System.out.print(number[i] + " ");
            if (last >= 0) {
                last--;
            } else {
                break;
            }

        }

    }

}
