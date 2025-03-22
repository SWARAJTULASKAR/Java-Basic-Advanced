
public class perfectNumber {

    // divisor addition addtion == number 
    public static void perfect(int n) {
        int temp = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
                temp = temp + i;

            }

        }
        if (temp == n) {
            System.out.println("It is a perfect Number" + n);
        } else {
            System.out.println("It is not a perfect number :" + n);
        }

    }

    public static void main(String[] args) {
        int n = 15;
        perfect(n);

    }
}
