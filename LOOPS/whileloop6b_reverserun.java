
public class whileloop6b_reverserun {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter any number :");
        int n = 12456;
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            n = n / 10;
            rev = (rev * 10) + lastdigit;

        }
        System.out.print(rev);

    }
}
