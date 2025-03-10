
import java.util.Arrays;

// Brute Force Approach
public class secondlargest {

    public static void main(String[] args) {
        int arr[] = {43, 324, 324, 324, 234, 234, 3433333, 234};
        int n;
        Arrays.sort(arr);
        //for(int i = 0 ; i < arr.length ; i++)

        n = (arr.length - 1) - 1;

        System.out.print("Smallerst number of arrays : " + arr[0]);
        System.out.print("Largest number of arrays is : " + arr[n]);

    }
}
