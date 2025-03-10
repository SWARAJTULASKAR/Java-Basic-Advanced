
public class paindromenumber {

    public static boolean palin(int n) {
        int rem = 0;
        int reverse = 0;
        int temp = n;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        if (n == reverse) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int min = 111, max = 550;
        int revNum = 0;
        //palin(min, max, revNum);
        for (int i = min; i <= max; i++) {
            if (palin(i)) {
                System.out.print(i + " ");
            }

        }

    }
}
