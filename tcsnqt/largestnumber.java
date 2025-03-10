
import java.util.*;

public class largestnumber {

    public static void main(String[] args) {
        int arr[] = {32, 232, 45435, 564, 6, 765, 57};
        largestnumber(arr);

    }

    static void largestnumber(int arr[]) {
        Arrays.sort(arr);
        System.out.println("Largest number of arr:" + arr[arr.length - 1]);

    }

}
