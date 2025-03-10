
public class armStrong {

    public static boolean armstrong(int N) {
        double temp = 0;
        double rev = 0;
        double arm;
        int x = N;
        while (N > 0) {
            rev = N % 10;
            arm = Math.pow(rev, 3);
            temp = temp + arm;
            N = N / 10;

        }
        //System.out.print(temp);
        if (x == temp) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int N = 1222222;
        if (armstrong(N)) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}
