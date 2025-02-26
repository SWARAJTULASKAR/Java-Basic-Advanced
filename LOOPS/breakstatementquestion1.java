
import java.util.*;
// if value is multiple by 10 loop is break 
// otherwise loop is going on

public class breakstatementquestion1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.print("enter any number :");
            int number = sc.nextInt();
            if (number % 10 == 0) {
                break;
            }
            System.out.println("your value is " + i + number);
        }
    }
}
