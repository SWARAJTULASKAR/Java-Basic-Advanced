
import java.util.*;

public class whileloop4_sumofnaturalnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of N : ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum = sum + i;

            i++;

        }
        System.out.print("Sum is : " + sum);
    }
}
