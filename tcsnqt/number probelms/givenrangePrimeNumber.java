
public class givenrangePrimeNumber {

    public static boolean givenRange(int n) {
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
        int n = 20, m = 2;
        //givenRange(n, m);
        if (givenRange(n)) {
            System.out.print(n);
        }

    }
}
