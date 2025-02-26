
import java.util.*;

public class whileloop6_reversenumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number :");
        int n = sc.nextInt();
        while (n > 0) {
            int lastdigit = n % 10;
            n = n / 10;
            System.out.print(lastdigit);
        }

    }
}
