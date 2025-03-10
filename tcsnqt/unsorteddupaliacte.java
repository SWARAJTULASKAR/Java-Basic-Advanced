
import java.util.HashMap;

public class unsorteddupaliacte {

    public static void unsort(int arr[]) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!mp.containsKey(arr[i])) {
                System.out.print(arr[i] + " ");

                mp.put(arr[i], 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 3, 5, 6, 8, 3};
        unsort(arr);
    }
}
