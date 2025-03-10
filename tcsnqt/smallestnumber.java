
import java.util.*;

public class smallestnumber {

    public static void main(String[] args) {
        int arr[] = {43, 23, 34, 54, 565, 766, 87,};

        smallestnumber(arr);
    }

    static void smallestnumber(int arr[]) {
        Arrays.sort(arr);
        System.out.println("Smallest number of arrays is :" + arr[0]);
    }
}
