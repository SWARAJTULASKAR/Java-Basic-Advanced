
public class primenumber {

    public static boolean prime(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt = cnt + 1;
            }

        }
        if (cnt == 2) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int n = 2;
        if (prime(n)) {
            System.out.print("It is a prime number");

        } else {
            System.out.print("it is not a prime number");
        }

    }
}
