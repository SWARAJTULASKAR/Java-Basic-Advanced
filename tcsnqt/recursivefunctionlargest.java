
public class recursivefunctionlargest {

    // by using recursive funtion 
    public static void main(String[] args) {
        int arr[] = {23, 43, 64, 57, 76, 342, 2343, 2434, 234, 4324, 324, 2443};
        // int max = 0;

        System.out.print("Largest number of arr is :" + largestnumber(arr));
        largestnumber(arr);

    }

    static int largestnumber(int arr[]) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }
}
